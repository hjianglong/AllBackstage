package com.rx.allbackstage.entity.yhp.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("指定自定义背景")
@TableName("yhp_oilpainting_bk_mid")
public class YhpoilpaintingNewbkmin {

    @ApiModelProperty(value = "bk")
    @TableField("bk")
    private String bk;

    @ApiModelProperty(value = "mid")
    @TableField("mid")
    private String mid;

    @ApiModelProperty(value = "0 普通图的背景 1 OCR图的背景")
    @TableField("forocr")
    private Long forocr;
}
