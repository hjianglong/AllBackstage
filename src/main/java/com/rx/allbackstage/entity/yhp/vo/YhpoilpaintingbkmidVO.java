package com.rx.allbackstage.entity.yhp.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("指定自定义背景")
@TableName("yhp_oilpainting_bk_mid")
public class YhpoilpaintingbkmidVO {

    @ApiModelProperty(value = "cid")
    @TableField("cid")
    private Long cid;

    @ApiModelProperty(value = "bk")
    @TableField("bk")
    private String bk;

    @ApiModelProperty(value = "入库时间")
    @TableField("intime")
    private String intime;

    @ApiModelProperty(value = "0 普通图的背景 1 OCR图的背景")
    @TableField("forocr")
    private Long forocr;


}
