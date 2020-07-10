
import configparser
import os

config_dir = os.path.join(os.path.dirname(os.path.dirname(__file__)), 'config.ini')


class ReadConfig(configparser.ConfigParser):
    def __init__(self):
        # 实例化对象
        super().__init__()
        # 加载文件
        self.read(config_dir, encoding='utf8')


conf = ReadConfig()

if __name__ == '__main__':
    conf = ReadConfig()
