//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.qiaofangyun.marketing.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class PropertyBaseDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String propertyBaseUuid;
    private String companyUuid;


    private String districtName;
    private String areaName;
    private String estateName;
    private String estateUuid;
    private Integer shi;
    private Integer ting;
    private Integer wei;
    private Integer floor;
    private Integer totalFloor;
    private Float square;
    private Integer direction;
    private Integer completeYear;
    private Integer decoration;
    private Integer usageTypeId;
    private String tradeType;

    private Float price;
    private Float rentPrice;
    private String buildingName;
    private String buildingUnit;
    private String unitName;
    private String roomNo;
    private String employeeName;
    private String employeeUuid;
    private String picture;
    private Boolean propertyDeleted;
    private Boolean preview;
    private Boolean hasKey;
    private Boolean exclusive;
    private Date delegateTime;
    private Double longitude;
    private Double latitude;

    private String tradeStatus;
    private Date propertyCreatedTime;
    private Date propertyApprovedTime;
    private String address;
    private BigDecimal internalSquare;
    private Integer kitchen;
    private Integer balcony;
    private Boolean elevator;
    private BigDecimal sellBasePrice;
    private BigDecimal rentBasePrice;
    private Integer rentType;
    private Integer paymentTerms;
    private String independFacilities;
    private String rentPriceInclude;
    private Date rentExpireTime;
    private Integer grade;
    private Integer propertyEquityYear;
    private Date buyTime;
    private String sellCause;
    private Boolean onlyHouse;
    private Boolean credit;
    private String creditRemark;
    private Integer delegateType;
    private Date handOverDate;
    private String recordNo;
    private String consignRemark;
    private Date consignStartDate;
    private Date consignEndDate;
    private Integer propertyLabel;
    private String remark;
    private Integer occupancy;
    private Integer equityType;
    private Integer taxType;
    private String supportFacilities;
    private String managementFee;
    private Boolean park;
    private Integer parkType;
    private Integer buyPaymentType;
    private String certificationNo;
    private Integer propertyRightYear;
    private String descriptionTitle;
    private String propertyDesc;
    private String environment;

}
