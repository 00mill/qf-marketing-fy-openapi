package com.qiaofangyun.marketing.response;

import lombok.Data;

import java.util.List;

/**
 * @author yuexing.wang
 */
@Data
public class ListValidResourceByUuidsResponse<T> extends CommonResponse {

    /**
     * 增加模板类型，方便以后控制字段
     */
    private List<T> data;

}
