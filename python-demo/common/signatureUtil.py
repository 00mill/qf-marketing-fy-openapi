
from .md5Util import md5


def get_signature(app_id, key, time_sign):
    """获取signature"""
    signature = md5(app_id + key + str(time_sign))  # signature = md5((appId+appKey+timeSign))
    return signature
