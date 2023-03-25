package com.rx.allbackstage.entity.yhp.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("指定公共背景")
@TableName("yhp_oilpainting_bk")
public class YhpoilpaintingbkNewbk {

    @ApiModelProperty(value = "bk")
    @TableField("bk")
    private String bk;

    @ApiModelProperty(value = "0 普通图的背景 1 OCR图的背景")
    @TableField("forocr")
    private Long forocr;
}
