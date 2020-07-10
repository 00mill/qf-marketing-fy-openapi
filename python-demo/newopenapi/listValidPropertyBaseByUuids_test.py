
import requests
import logging
import unittest
from api.common.readconfig import conf
from api.common.timeSignUtil import get_now_time_sign
from api.common.signatureUtil import get_signature

LOG_FORMAT = '%(asctime)s - %(levelname)s - %(message)s'
logging.basicConfig(level=logging.INFO, format=LOG_FORMAT)


def PullResourceUuidList():
    env = conf.get('common', 'runEnv')
    baseUrl = conf.get(env, 'marketingopenapi_url')
    appId = conf.get('common', 'appId')
    key = conf.get('common', 'key')
    time_sign = get_now_time_sign()
    header = {
        "Content-Type": "application/json;charset=UTF-8",
        "appId": appId,
        "timeSign": str(time_sign),
        "signature": get_signature(appId, key, time_sign)
    }
    requests_url = baseUrl + '/company/pullResourceUuidList'
    payload = {
        "dto":
            {
                # "endUpdatedTime": "2019-03-06 13:00:00",
                # "scrollId": 123,
                # "startUpdatedTime": "2019-03-06 12:00:00",
                "useAsc": "false",
                "windowSize": 100
            },
        "resourceType": "PROPERTY_BASE"
    }
    r = requests.post(requests_url, json=payload, headers=header)
    return r.json()


class ListValidPropertyBaseByUuidsTest(unittest.TestCase):

    def setUp(self):
        env = conf.get('common', 'runEnv')
        self.baseUrl = conf.get(env, 'marketingopenapi_url')
        self.appId = conf.get('common', 'appId')
        self.key = conf.get('common', 'key')
        time_sign = get_now_time_sign()
        self.header = {
            "Content-Type": "application/json;charset=UTF-8",
            "appId": self.appId,
            "timeSign": str(time_sign),
            "signature": get_signature(self.appId, self.key, time_sign)
        }

    def tearDown(self):
        logging.info('请求接口为：{}'.format(self.requests_url))
        logging.info('请求参数为：{}'.format(self.payload))
        logging.info('响应结果为：{}'.format(self.result))

    def test_list_ropertyBase_by_uuids(self):
        """根据uuids查询公共营销库房源（不包含删除的）"""
        property_list = PullResourceUuidList()
        self.requests_url = self.baseUrl + 'commonhouse/listValidPropertyBaseByUuids'
        self.payload = {
            "uuids": [
                property_list['data']['list'][0]['resourceUuid'],
                # property_list['data']['list'][1]['resourceUuid'],
                property_list['data']['list'][3]['resourceUuid']
                # "d96159cf-606b-4d6b-a9fa-83a4f7ca9081"   # deleted = True
            ]
        }
        r = requests.post(self.requests_url, json=self.payload, headers=self.header)
        self.result = r.json()
        self.assertTrue(len(self.result['data']), msg='没有查到该房源信息')


if __name__ == '__main__':
    unittest.main()
