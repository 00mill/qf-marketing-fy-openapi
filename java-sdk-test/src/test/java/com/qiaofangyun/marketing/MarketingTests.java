package com.qiaofangyun.marketing;

import com.google.common.collect.Lists;
import com.qiaofangyun.marketing.feignclient.OnlineMaketingFeign;
import com.qiaofangyun.marketing.feignclient.TestMaketingFeign;
import com.qiaofangyun.marketing.request.ListValidResourceByUuidsRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MarketingTests {

    @Autowired
    public TestMaketingFeign testMaketingFeign;

    @Autowired
    public OnlineMaketingFeign onlineMaketingFeign;

    @Test

    public void listValidPropertyBaseByUuids() {
        testMaketingFeign.listValidPropertyBaseByUuids("appid_v20_docking_marketing", "c5888f3e-4ffc-41fd-b323-03888a906edb", new ListValidResourceByUuidsRequest(Lists.newArrayList("123")));
    }
}

