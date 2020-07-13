package com.qiaofangyun.marketing;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.qiaofangyun.marketing.dto.PropertyBaseDTO;
import com.qiaofangyun.marketing.dto.PropertyVideoInfoDTO;
import com.qiaofangyun.marketing.feignclient.OnlineMaketingFeign;
import com.qiaofangyun.marketing.feignclient.TestMaketingFeign;
import com.qiaofangyun.marketing.request.ListValidResourceByUuidsRequest;
import com.qiaofangyun.marketing.request.PullResourceUuidListRequest;
import com.qiaofangyun.marketing.request.PullResourceUuidListRequestDTO;
import com.qiaofangyun.marketing.request.ResourceTypeEnum;
import com.qiaofangyun.marketing.response.ListValidResourceByUuidsResponse;
import com.qiaofangyun.marketing.response.PullResourceUuidListResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MarketingPropertyTests {

    @Autowired
    public TestMaketingFeign testMaketingFeign;

    @Autowired
    public OnlineMaketingFeign onlineMaketingFeign;

    @Test
    public void pullResourceUuidList() {
        PullResourceUuidListRequest pullResourceUuidListRequest = new PullResourceUuidListRequest();
        PullResourceUuidListRequestDTO dto = new PullResourceUuidListRequestDTO();
        dto.setUseAsc(true);
        dto.setWindowSize(10);
        pullResourceUuidListRequest.setDto(dto);
        pullResourceUuidListRequest.setResourceType(ResourceTypeEnum.PROPERTY_BASE);
        System.out.println(JSON.toJSONString(pullResourceUuidListRequest,true));
        PullResourceUuidListResponse appid_v20_docking_marketing = testMaketingFeign.pullResourceUuidList("appid_v20_docking_marketing", "c5888f3e-4ffc-41fd-b323-03888a906edb", pullResourceUuidListRequest);
        System.out.println(JSON.toJSONString(appid_v20_docking_marketing,true));
    }


    @Test
    public void listValidPropertyBaseByUuids() {
        ListValidResourceByUuidsRequest request = new ListValidResourceByUuidsRequest(Lists.newArrayList("bca5bcd9-e4fc-4f0f-9a64-20000dd87b0c","14101d6e-e8ab-4641-991f-014c0a0feb67"
                ));

        ListValidResourceByUuidsResponse<PropertyBaseDTO> appid_v20_docking_marketing = testMaketingFeign.listValidPropertyBaseByUuids("appid_v20_docking_marketing", "c5888f3e-4ffc-41fd-b323-03888a906edb", request);
        System.out.println(JSON.toJSONString(request,true));
        System.out.println(JSON.toJSONString(appid_v20_docking_marketing,true));

    }


}

