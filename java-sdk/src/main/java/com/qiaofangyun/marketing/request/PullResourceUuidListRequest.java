package com.qiaofangyun.marketing.request;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author gong.hua
 */
@Data
public class PullResourceUuidListRequest {

    @NotNull
    @Valid
    private PullResourceUuidListRequestDTO dto;

    @NotNull
    private ResourceTypeEnum resourceType;
}
