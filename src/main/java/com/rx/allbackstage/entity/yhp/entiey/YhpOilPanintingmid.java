package com.rx.allbackstage.entity.yhp.entiey;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
@ApiModel("自定义库")
@TableName("yhp_oilpainting_mid")
public class YhpOilPanintingmid {

    @ApiModelProperty(value = "cid")
    @TableField("cid")
    private Long cid;

    @ApiModelProperty(value = "img")
    @TableField("img")
    private String img;

    @ApiModelProperty(value = "mid")
    @TableField("mid")
    private String mid;

    @ApiModelProperty(value = "filetype")
    @TableField("filetype")
    private String filetype;

    @ApiModelProperty(value = "intime")
    @TableField("intime")
    private String intime;

}
