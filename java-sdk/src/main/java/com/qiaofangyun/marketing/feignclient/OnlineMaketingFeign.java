package com.qiaofangyun.marketing.feignclient;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "online", url = "https://marketing.qiaofangyun.com/api/marketingopenapi", configuration = MarketingFeignConfiguration.class)
public interface OnlineMaketingFeign extends MarketingOpenApi {
}
