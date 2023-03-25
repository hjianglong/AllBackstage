package com.rx.allbackstage.entity.yhp.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("机器列表")
@TableName("yhp_ai_mid")
public class YhpaiminVO {

    @ApiModelProperty(value = "cid")
    @TableField("cid")
    private Long cid;

    @ApiModelProperty(value = "设备号")
    @TableField("mid")
    private String mid;

    @ApiModelProperty(value = "机器名称")
    @TableField("mname")
    private String mname;

    @ApiModelProperty(value = "绑定的主题id")
    @TableField("themeId")
    private Long themeid;
}
