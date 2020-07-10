package com.qiaofangyun.marketing.feignclient;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "test", url = "http://marketing.test.qiaofangyun.com/api/marketingopenapi", configuration = {MarketingFeignConfiguration.class})
public interface TestMaketingFeign extends MarketingOpenApi {
}
