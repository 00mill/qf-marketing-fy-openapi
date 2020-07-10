package com.qiaofangyun.marketing.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author gong.hua
 */
@Data
public class PullResourceUuidListResponse extends CommonResponse {
    private PullResourceUuidListResponseDTO data;


    /**
     * 每次最多一百条，如果当前list的size等于100条，需要查看下一页
     * 如果list的size小于100条，说明没有下一页
     *
     * @author gong.hua
     */
    @Data
    public static class PullResourceUuidListResponseDTO {


        private Integer listSize;

        private List<ResourceUuidDTO> list;

        @Data
        public static class ResourceUuidDTO {
            /**
             * 资源唯一排序ID  不序列化
             */
            @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
            private Long resourceId;

            /**
             * 资源唯一Uuid
             */
            private String resourceUuid;

            /**
             * 资源删除标记
             */
            private Boolean resourceDeleted;

            /**
             * 资源更新时间
             */
            private Date resourceUpdatedTime;
        }

    }
}
