//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.qiaofangyun.marketing.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class PropertyVrPhotoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String vrPhotoUuid;
    private String vrInfoUuid;
    private String companyUuid;

    private String photoCategory;
    private String photoSubCategory;
    private String photoUrl;
    private String photoMeta;
    private String thumbnailPhotoUrl;
    private String floorName;
    private Boolean coverFlag;
    private Boolean photoDeleted;
    private Date updatedTime;

}
