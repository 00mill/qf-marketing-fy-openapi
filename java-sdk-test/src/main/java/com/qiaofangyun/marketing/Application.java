package com.qiaofangyun.marketing;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients(value = {"com.qiaofangyun.marketing"})
@SpringBootApplication
@ComponentScan(value = {"com.qiaofangyun.marketing"})
public class Application {

    @Bean
    Logger.Level feignLoggerLevel() {
        //这里记录所有，根据实际情况选择合适的日志level
        return Logger.Level.FULL;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

