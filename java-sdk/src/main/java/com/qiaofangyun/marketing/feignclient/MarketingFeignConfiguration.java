package com.qiaofangyun.marketing.feignclient;

import feign.RequestInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Feign 客户端配置
 *
 * @author huagong
 * @date 2018/8/13
 */
@Slf4j
@Configuration
public class MarketingFeignConfiguration {

    @Bean
    public RequestInterceptor requestInterceptor() {
        return (requestTemplate) -> {
            if (requestTemplate.headers().get("appId") != null) {
                String appId = (String) requestTemplate.headers().get("appId").toArray()[0];
                String appKey = (String) requestTemplate.headers().get("appKey").toArray()[0];
                Long timeSign = System.currentTimeMillis();
                String signature = md5(appId + appKey + timeSign);
                requestTemplate.header("signature", signature);
                requestTemplate.header("timeSign", timeSign + "");
            }
        };
    }

    public static String md5(String str) {
        return DigestUtils.md5Hex(str);
    }

}