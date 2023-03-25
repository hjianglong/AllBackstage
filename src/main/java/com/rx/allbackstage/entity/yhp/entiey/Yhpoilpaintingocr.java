package com.rx.allbackstage.entity.yhp.entiey;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("OCR油画")
@TableName("yhp_oilpainting_ocr")
public class Yhpoilpaintingocr {

    @ApiModelProperty(value = "自增ID")
    @TableField("cid")
    private Long cid;

    @ApiModelProperty(value = "主题ID")
    @TableField("themeid")
    private Long themeid;

    @ApiModelProperty(value = "入库时间")
    @TableField("intime")
    private String intime;

    @ApiModelProperty(value = "关键字")
    @TableField("keys")
    private String keys;

}
