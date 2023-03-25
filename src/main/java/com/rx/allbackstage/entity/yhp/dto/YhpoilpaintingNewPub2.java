package com.rx.allbackstage.entity.yhp.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("公共库")
@TableName("yhp_oilpainting")
public class YhpoilpaintingNewPub2 {

    @ApiModelProperty(value = "油画数据")
    @TableField("img")
    private String img;

    @ApiModelProperty(value = "数据类型（图片img 文本txt 视频vedio）（图片1 视频2 音频3）")
    @TableField("filetype")
    private String filetype;

}
