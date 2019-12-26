import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
@Data
public class PropertyBaseImageDTO {

    /**
     * 图片类型
     */
    @ApiModelProperty("图片类型")
    private Integer category;

    /**
     * 图片源地址
     */
    @ApiModelProperty("图片源地址")
    private String url;

    /**
     * 图片Uuid
     */
    @ApiModelProperty("图片Uuid")
    private String photoUuid;

    /**
     * 图片源地址
     */
    @ApiModelProperty("是否为封面图{0:否，1：是}")
    private Integer iscover;


    @ApiModelProperty("图片类型/标签：卧室；餐厅；客厅；厨房；卫生间；阳台；户型图；外景；小区环境；保姆间；花园；入户；车库；书房；储物间；地下室；阁楼；衣帽间；露台；其他；")
    private String imageType;
    @ApiModelProperty("排序")
    private Integer ordered;
}
