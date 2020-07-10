//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.qiaofangyun.marketing.dto;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class PropertyVideoInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("内部公司 UUID")
    private String companyUuid;
    @ApiModelProperty("内部房源视频 UUID")
    private String videoUuid;
    @ApiModelProperty("内部房源 UUID")
    private String propertyBaseUuid;

    @ApiModelProperty("原视频链接")
    private String originalVideoUrl;
    @ApiModelProperty("编码视频链接")
    private String encodingVideoUrl;
    @ApiModelProperty("加水印视频链接")
    private String watermarkVideoUrl;
    @ApiModelProperty("缩略图链接")
    private String thumbnailUrl;
    @ApiModelProperty("房源视频是否删除(1: 已删除，0:未删除)")
    private Boolean videoDeleted;
    private Date updatedTime;

}
