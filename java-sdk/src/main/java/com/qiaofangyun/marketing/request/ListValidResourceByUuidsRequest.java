package com.qiaofangyun.marketing.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 * @author gong.hua
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListValidResourceByUuidsRequest implements Serializable {

    @Size(min = 1, max = 200, message = "UUID集合大小必须在1到200之间")
    private List<String> uuids;

}
