package com.rx.allbackstage.entity.yhp.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("公共库")
@TableName("yhp_oilpainting")
public class YhpoilpaintingNewPub {

    @ApiModelProperty(value = "油画数据")
    @TableField("img")
    private String img;

    @ApiModelProperty(value = "数据类型（图片img 文本txt 视频vedio）（图片1 视频2 音频3）")
    @TableField("filetype")
    private String filetype;

    @ApiModelProperty(value = "用户账号")
    @TableField("username")
    private String username;

    @ApiModelProperty(value = "文字描述")
    @TableField("description")
    private String description;

    @ApiModelProperty(value = "内容分类(世界名画,学生作品,校史、馆史,领导风采,党建红色文化,热门图书、新书推荐,报纸热门头条,期刊热门头条,公告服")
    @TableField("contentCategory")
    private String contentCategory;

}
