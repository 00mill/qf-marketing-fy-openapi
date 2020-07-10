package com.qiaofangyun.marketing.request;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class PullResourceUuidListRequestDTO {

    @JsonFormat(pattern =  "yyyy-MM-dd HH:mm:ss.SSS", timezone = "GMT+8")
    private Date startUpdatedTime;

    @JsonFormat(pattern =  "yyyy-MM-dd HH:mm:ss.SSS", timezone = "GMT+8")
    private Date endUpdatedTime;

    private Long scrollId;

    @Max(200)
    @Min(1)
    @NotNull
    private Integer windowSize;


    @NotNull
    private Boolean useAsc;
}
