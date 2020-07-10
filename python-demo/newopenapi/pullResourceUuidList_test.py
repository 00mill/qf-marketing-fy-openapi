
import requests
import logging
import unittest
from api.common.readconfig import conf
from api.common.timeSignUtil import get_now_time_sign
from api.common.signatureUtil import get_signature


LOG_FORMAT = '%(asctime)s - %(levelname)s - %(message)s'
logging.basicConfig(level=logging.INFO, format=LOG_FORMAT)


class PullResourceUuidListTest(unittest.TestCase):

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

    def test_list_pullResourceUuid_property(self):
        """窗口滚动方式拉取房源List"""
        self.requests_url = self.baseUrl + 'company/pullResourceUuidList'
        self.payload = {
            "dto":
                {
                    # "endUpdatedTime": "2020-07-09 01:00:02",
                    "scrollId": 100,
                    # "startUpdatedTime": "2020-07-09 21:00:00",
                    "useAsc": "true",
                    "windowSize": 200
                },
            "resourceType": "PROPERTY_BASE"
        }
        r = requests.post(self.requests_url, json=self.payload, headers=self.header)
        self.result = r.json()
        self.assertTrue(len(self.result['data']['list']), msg='接口在这个公司没有查到房源信息')


    def test_list_pullResourceUuid_employee(self):
        """窗口滚动方式拉取公司经纪人"""
        self.requests_url = self.baseUrl + 'company/pullResourceUuidList'
        self.payload = {
            "dto":
                {
                    # "endUpdatedTime": "2020-07-09 14:52:49",
                    # "scrollId": 123,
                    # "startUpdatedTime": "2020-07-09 20:21:53",
                    "useAsc": "True",
                    "windowSize":200
                },
            "resourceType": "BROKER_INFO"
        }
        r = requests.post(self.requests_url, json=self.payload, headers=self.header)
        self.result = r.json()
        self.assertTrue(len(self.result['data']['list']), msg='接口在这个公司没有查到经纪人信息')

    def test_list_pullResourceUuid_Vr(self):
        """窗口滚动方式拉取vr"""
        self.requests_url = self.baseUrl + 'company/pullResourceUuidList'
        self.payload = {
            "dto":
                {
                    # "endUpdatedTime": "2020-07-06 13:00:00",
                    # "scrollId": 123,
                    # "startUpdatedTime": "2020-07-09 20:21:00",
                    "useAsc": "True",
                    "windowSize": 100
                },
            "resourceType": "PROPERTY_VR_INFO"
        }
        r = requests.post(self.requests_url, json=self.payload, headers=self.header)
        self.result = r.json()
        self.assertTrue(len(self.result['data']['list']), msg='接口在这个公司没有查到VR信息')

    def test_list_pullResourceUuid_VrPhoto(self):
        """窗口滚动方式拉取vr图片"""
        self.requests_url = self.baseUrl + 'company/pullResourceUuidList'
        self.payload = {
            "dto":
                {
                    # "endUpdatedTime": "2020-07-06 13:00:00",
                    "scrollId": 123,
                    # "startUpdatedTime": "2020-07-09 21:20:00",
                    "useAsc": "True",
                    "windowSize": 100
                },
            "resourceType": "PROPERTY_VR_PHOTO"
        }
        r = requests.post(self.requests_url, json=self.payload, headers=self.header)
        self.result = r.json()
        self.assertTrue(len(self.result['data']['list']), msg='接口在这个公司没有查到VR图片信息')

    def test_list_pullResourceUuid_video(self):
        """窗口滚动方式拉取房源视频"""
        self.requests_url = self.baseUrl + 'company/pullResourceUuidList'
        self.payload = {
            "dto":
                {
                    # "endUpdatedTime": "2020-07-03 16:33:00",
                    # "scrollId":" 123",
                    # "startUpdatedTime": "2020-07-09 21:14:00",
                    "useAsc": "false",
                    "windowSize": 100
                },
            "resourceType": "PROPERTY_VIDEO"
        }
        r = requests.post(self.requests_url, json=self.payload, headers=self.header)
        self.result = r.json()
        self.assertTrue(len(self.result['data']['list']), msg='接口在这个公司没有查到video信息')


if __name__ == '__main__':
    unittest.main()
