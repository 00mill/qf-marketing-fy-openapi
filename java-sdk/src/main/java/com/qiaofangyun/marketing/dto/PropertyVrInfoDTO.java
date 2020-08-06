//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.qiaofangyun.marketing.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class PropertyVrInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String vrInfoUuid;
    private String companyUuid;
    private String propertyBaseUuid;

    private Float cameraHeight;
    private Boolean multiFloorFlag;
    private Integer topFloor;
    private Integer bottomFloor;
    private String direction;
    private Boolean vrDeleted;
    private String roamViewUrl;
    private String sourceUrl;
    private String sourceHash;
    private String coverPhotoUrl;

    private Date updatedTime;

    private List<PropertyVrPhotoDTO> propertyVrPhotoDTOS;
}
