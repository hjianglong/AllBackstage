package com.rx.allbackstage.entity.yhp.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("用户上传素材")
@TableName("yhp_oilpainting_upload")
public class YhpoilpaintingNewupload {

    @ApiModelProperty(value = "用户账号")
    @TableField("username")
    private String username;

    @ApiModelProperty(value = "素材")
    @TableField("filepath")
    private String filepath;

    @ApiModelProperty(value = "文件类型 （0图片img 1视频vedio 2文本txt ）")
    @TableField("filetype")
    private String filetype;

    @ApiModelProperty(value = "文字描述")
    @TableField("description")
    private String description;

}
