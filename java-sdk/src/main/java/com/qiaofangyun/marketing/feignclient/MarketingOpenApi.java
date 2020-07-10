package com.qiaofangyun.marketing.feignclient;

import com.qiaofangyun.marketing.dto.*;
import com.qiaofangyun.marketing.request.ListValidResourceByUuidsRequest;
import com.qiaofangyun.marketing.request.PullResourceUuidListRequest;
import com.qiaofangyun.marketing.response.ListValidResourceByUuidsResponse;
import com.qiaofangyun.marketing.response.PullResourceUuidListResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author gong.hua
 */
interface MarketingOpenApi {

    /**
     * 窗口滚动方式拉取资源UuidList
     *
     * @param appId
     * @param appKey
     * @param request
     * @return
     */
    @RequestMapping(value = "/company/pullResourceUuidList", method = RequestMethod.POST, headers = "content-type=application/json")
    PullResourceUuidListResponse pullResourceUuidList(@RequestHeader("appId") String appId, @RequestHeader("appKey") String appKey, @RequestBody PullResourceUuidListRequest request);


    /**
     * 根据uuids查询员工信息（不包含删除的)
     *
     * @param appId
     * @param appKey
     * @param request
     * @return
     */
    @RequestMapping(value = "/employee/listValidEmployeeByUuids", method = RequestMethod.POST, headers = "content-type=application/json")
    ListValidResourceByUuidsResponse<EmployeeDTO> listValidEmployeeByUuids(@RequestHeader("appId") String appId, @RequestHeader("appKey") String appKey, @RequestBody ListValidResourceByUuidsRequest request);


    /**
     * 通过uuids集合list获取房源信息(不包含删除的)
     *
     * @param appId
     * @param appKey
     * @param request
     * @return
     */
    @RequestMapping(value = "/commonhouse/listValidPropertyBaseByUuids", method = RequestMethod.POST, headers = "content-type=application/json")
    ListValidResourceByUuidsResponse<PropertyBaseDTO> listValidPropertyBaseByUuids(@RequestHeader("appId") String appId, @RequestHeader("appKey") String appKey, @RequestBody ListValidResourceByUuidsRequest request);


    /**
     * 通过uuids集合list获取全景房VR信息(不包含删除的)
     *
     * @param appId
     * @param appKey
     * @param request
     * @return
     */
    @RequestMapping(value = "/commonhouse/listValidPropertyVrInfoByUuids", method = RequestMethod.POST, headers = "content-type=application/json")
    ListValidResourceByUuidsResponse<PropertyVrInfoDTO> listValidPropertyVrInfoByUuids(@RequestHeader("appId") String appId, @RequestHeader("appKey") String appKey, @RequestBody ListValidResourceByUuidsRequest request);


    /**
     * 通过uuids集合list获取全景房2D-VR图片信息(不包含删除的)
     *
     * @param appId
     * @param appKey
     * @param request
     * @return
     */
    @RequestMapping(value = "/commonhouse/listValidPropertyVrPhotoByUuids", method = RequestMethod.POST, headers = "content-type=application/json")
    ListValidResourceByUuidsResponse<PropertyVrPhotoDTO> listValidPropertyVrPhotoByUuids(@RequestHeader("appId") String appId, @RequestHeader("appKey") String appKey, @RequestBody ListValidResourceByUuidsRequest request);


    /**
     * 通过uuids集合list获取房源视频信息(不包含删除的)
     *
     * @param appId
     * @param appKey
     * @param request
     * @return
     */
    @RequestMapping(value = "/commonhouse/listValidPropertyVideoByUuids", method = RequestMethod.POST, headers = "content-type=application/json")
    ListValidResourceByUuidsResponse<PropertyVideoInfoDTO> listValidPropertyVideoByUuids(@RequestHeader("appId") String appId, @RequestHeader("appKey") String appKey, @RequestBody ListValidResourceByUuidsRequest request);


}
