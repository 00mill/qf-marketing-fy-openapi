
from datetime import datetime


def get_now_time_sign():
    """获取当前时间戳"""
    return int(round(datetime.now().timestamp() * 1000))
