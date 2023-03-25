package com.rx.allbackstage.entity.yhp.entiey;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("油画屏设置")
@TableName("yhp_oilpainting_times")
public class Yhpoilpaintingtimes {

    @ApiModelProperty(value = "自增id")
    @TableField("id")
    private Long id;

    @ApiModelProperty(value = "热门推荐图书的切换时间")
    @TableField("booktime")
    private Long booktime;

    @ApiModelProperty(value = "报纸切换时间")
    @TableField("papertime")
    private Long papertime;

    @ApiModelProperty(value = "报纸滚动速度")
    @TableField("papermove")
    private Long papermove;

    @ApiModelProperty(value = "期刊切换时间")
    @TableField("qktime")
    private Long qktime;

    @ApiModelProperty(value = "普通油画切换时间")
    @TableField("oiltime")
    private Long oiltime;

    @ApiModelProperty(value = "跑马灯闪切换时间")
    @TableField("oilspeed1")
    private Long oilspeed1;

    @ApiModelProperty(value = "跑马灯闪1切换速度")
    @TableField("oilspeed2")
    private Long oilspeed2;

    @ApiModelProperty(value = "跑马灯闪2切换速度")
    @TableField("oilspeed3")
    private Long oilspeed3;

    @ApiModelProperty(value = "报纸名称")
    @TableField("papername")
    private String papername;

    @ApiModelProperty(value = "公告切换时间")
    @TableField("noticetime")
    private Long noticetime;

    @ApiModelProperty(value = "公告滚动时间")
    @TableField("noticespeed")
    private Long noticespeed;

    @ApiModelProperty(value = "公告中视频切换时间")
    @TableField("videotime")
    private Long videotime;

    @ApiModelProperty(value = "音量")
    @TableField("volume")
    private Long volume;

    @ApiModelProperty(value = "亮度")
    @TableField("light")
    private Long light;

    @ApiModelProperty(value = "雷达开关 0关1开")
    @TableField("dztmoshi")
    private String dztmoshi;

    @ApiModelProperty(value = "xztmoshi")
    @TableField("xztmoshi")
    private String xztmoshi;

    @ApiModelProperty(value = "imgmoshi")
    @TableField("imgmoshi")
    private String imgmoshi;

    @ApiModelProperty(value = "res4")
    @TableField("res4")
    private String res4;

    @ApiModelProperty(value = "res5")
    @TableField("res5")
    private String res5;

    @ApiModelProperty(value = "res6")
    @TableField("res6")
    private String res6;

    @ApiModelProperty(value = "res7")
    @TableField("res7")
    private String res7;

    @ApiModelProperty(value = "res8")
    @TableField("res8")
    private String res8;

    @ApiModelProperty(value = "res9")
    @TableField("res9")
    private String res9;

    @ApiModelProperty(value = "res10")
    @TableField("res10")
    private String res10;

}
