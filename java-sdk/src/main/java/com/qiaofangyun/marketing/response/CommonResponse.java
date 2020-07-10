package com.qiaofangyun.marketing.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.util.Map;

@Data
public class CommonResponse implements Serializable {

    private static final long serialVersionUID = -8349696635548886541L;

    private String responseCode;
    private String responseMessage;
    private String responseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Map<String, Object> errorDataMap;
}
