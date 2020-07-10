package com.qiaofangyun.marketing.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author yuexing.wang
 */
@Data
@ApiModel
public class EmployeeDTO {


    @ApiModelProperty(value = "外部员工uuid", required = true)
    private String name;

    @ApiModelProperty(value = "员工性别", required = true)
    private String gender;

    @ApiModelProperty(value = "员工手机", required = true)
    private String cellphone;

    @ApiModelProperty(value = "员工Uuid", hidden = true)
    private String employeeUuid;

    @ApiModelProperty(value = "员工头像,为空则选用默认头像")
    private String photoUrl;

    @ApiModelProperty(value = "更新时间")
    private Date updatedTime;

}
