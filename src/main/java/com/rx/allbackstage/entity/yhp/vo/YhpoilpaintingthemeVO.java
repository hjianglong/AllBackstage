package com.rx.allbackstage.entity.yhp.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@ApiModel("主题列表")
@TableName("yhp_oilpainting_theme")
public class YhpoilpaintingthemeVO {

    @ApiModelProperty(value = "主键id",dataType = "int",hidden = true)
    @TableId(type = IdType.AUTO,value = "id")
    private Long id;

    @ApiModelProperty(value = "主题名称")
    @TableField("themeName")
    private String themeName;

    @ApiModelProperty(value = "是否开启智慧联动(0:关闭;1:开启;)")
    @TableField("themeType")
    private Long themeType;

    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private String createTime;

    @ApiModelProperty(value = "主题对应的关键字数组格式[\"关键字1\",“关键字2”]")
    @TableField("keywords")
    private String keywords;

    @ApiModelProperty(value = "分类的ID")
    @TableField("fenleiid")
    private Long fenleiid;

    @ApiModelProperty(value = "播放模式 顺序和随机")
    @TableField("moshi")
    private String moshi;

    @ApiModelProperty(value = "图片切换时间")
    @TableField("qiehuanshijian")
    private String qiehuanshijian;

}
