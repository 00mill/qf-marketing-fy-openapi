package com.qiaofangyun.marketing;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
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
public class MarketingVRTests {

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
        pullResourceUuidListRequest.setResourceType(ResourceTypeEnum.PROPERTY_VR_INFO);
        System.out.println(JSON.toJSONString(pullResourceUuidListRequest,true));
        PullResourceUuidListResponse appid_v20_docking_marketing = testMaketingFeign.pullResourceUuidList("appid_v20_docking_marketing", "c5888f3e-4ffc-41fd-b323-03888a906edb", pullResourceUuidListRequest);
        System.out.println(JSON.toJSONString(appid_v20_docking_marketing,true));
    }


    @Test
    public void listValidPropertyVrInfoByUuids() {
        ListValidResourceByUuidsRequest request = new ListValidResourceByUuidsRequest(Lists.newArrayList("71e5de8cfca244919af4161602f380c0","bc5d7f56c67744e2a8a9fd1def6d8722"
                ));

        ListValidResourceByUuidsResponse<PropertyVrInfoDTO> appid_v20_docking_marketing = testMaketingFeign.listValidPropertyVrInfoByUuids("appid_v20_docking_marketing", "c5888f3e-4ffc-41fd-b323-03888a906edb", request);
        System.out.println(JSON.toJSONString(request,true));
        System.out.println(JSON.toJSONString(appid_v20_docking_marketing,true));

    }



    @Test
    public void listValidPropertyVrPhotoByUuids() {
        ListValidResourceByUuidsRequest request = new ListValidResourceByUuidsRequest(Lists.newArrayList("5e31835b6fa74d8fa3db500ab62f7b3a","264326c89168481690e643be92bf21f9","7b51ee8c785943838e831e84fb096160"
        ));

        ListValidResourceByUuidsResponse<PropertyVrPhotoDTO> appid_v20_docking_marketing = testMaketingFeign.listValidPropertyVrPhotoByUuids("appid_v20_docking_marketing", "c5888f3e-4ffc-41fd-b323-03888a906edb", request);
        System.out.println(JSON.toJSONString(request,true));
        System.out.println(JSON.toJSONString(appid_v20_docking_marketing,true));

    }
}

