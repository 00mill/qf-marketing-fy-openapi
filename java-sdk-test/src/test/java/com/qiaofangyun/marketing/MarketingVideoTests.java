package com.qiaofangyun.marketing;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.qiaofangyun.marketing.dto.PropertyVideoInfoDTO;
import com.qiaofangyun.marketing.dto.PropertyVrInfoDTO;
import com.qiaofangyun.marketing.dto.PropertyVrPhotoDTO;
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
public class MarketingVideoTests {

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
        pullResourceUuidListRequest.setResourceType(ResourceTypeEnum.PROPERTY_VIDEO);
        System.out.println(JSON.toJSONString(pullResourceUuidListRequest,true));
        PullResourceUuidListResponse appid_v20_docking_marketing = testMaketingFeign.pullResourceUuidList("appid_v20_docking_marketing", "c5888f3e-4ffc-41fd-b323-03888a906edb", pullResourceUuidListRequest);
        System.out.println(JSON.toJSONString(appid_v20_docking_marketing,true));
    }


    @Test
    public void listValidPropertyVideoByUuids() {
        ListValidResourceByUuidsRequest request = new ListValidResourceByUuidsRequest(Lists.newArrayList("3997af96-8bf0-4f52-8af0-e89044dde10a"
                ));

        ListValidResourceByUuidsResponse<PropertyVideoInfoDTO> appid_v20_docking_marketing = testMaketingFeign.listValidPropertyVideoByUuids("appid_v20_docking_marketing", "c5888f3e-4ffc-41fd-b323-03888a906edb", request);
        System.out.println(JSON.toJSONString(request,true));
        System.out.println(JSON.toJSONString(appid_v20_docking_marketing,true));

    }


}

