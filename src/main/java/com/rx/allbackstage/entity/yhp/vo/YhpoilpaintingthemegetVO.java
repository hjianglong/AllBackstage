package com.rx.allbackstage.entity.yhp.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("主题列表")
@TableName("yhp_oilpainting_theme")
public class YhpoilpaintingthemegetVO {

    @ApiModelProperty(value = "主键id",dataType = "int",hidden = true)
    @TableId(type = IdType.AUTO,value = "id")
    private Long id;

    @ApiModelProperty(value = "主题名称")
    @TableField("themeName")
    private String themeName;

    @ApiModelProperty(value = "是否开启智慧联动(0:关闭;1:开启;)")
    @TableField("themeType")
    private Long themeType;

    @ApiModelProperty(value = "主题关联的素材id")
    @TableField("themePic")
    private String themePic;

    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private String createTime;

    @ApiModelProperty(value = "主题对应的关键字数组格式[\"关键字1\",“关键字2”]")
    @TableField("keywords")
    private String keywords;

}
