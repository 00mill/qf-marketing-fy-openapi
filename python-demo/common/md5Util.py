
import hashlib


def md5(oragin_str):
    """md5加密"""
    m = hashlib.md5()
    b = oragin_str.encode(encoding='utf-8')
    m.update(b)
    return m.hexdigest()
