package com.rx.allbackstage.entity.yhp.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("关键字和他的图片")
@TableName("yhp_oilpainting_keyimg")
public class YhpoilpaintingNewkeyimg {

    @ApiModelProperty(value = "多个关键词,号分割")
    @TableField("objectkey")
    private String objectkey;

    @ApiModelProperty(value = "资源数据")
    @TableField("img")
    private String img;

    @ApiModelProperty(value = "资源类型")
    @TableField("filetype")
    private String filetype;
}
