package cn.tedu.smarthospital.pojo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AdminUserVO {
    @JsonProperty("aId")
    private Integer aId;
    @JsonProperty("aName")
    private String aName;
}
