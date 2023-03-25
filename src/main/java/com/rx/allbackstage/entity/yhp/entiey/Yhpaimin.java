package com.rx.allbackstage.entity.yhp.entiey;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@ApiModel("机器列表")
@TableName("yhp_ai_mid")
public class Yhpaimin {

    @ApiModelProperty(value = "cid")
    @TableField("cid")
    private Long cid;

    @ApiModelProperty(value = "设备号")
    @TableField("mid")
    private String mid;

    @ApiModelProperty(value = "机器mac地址")
    @TableField("mac")
    private String mac;

    @ApiModelProperty(value = "机器名称")
    @TableField("mname")
    private String mname;

    @ApiModelProperty(value = "跑马灯（序号）")
    @TableField("m_order")
    private Long m_order;

    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty(value = "机器类型  0 常看 1 新上架 2 油画屏  3 风向标  4 课桌 5太空舱 6读报机 7瀑布流 8手机app")
    @TableField("casetype")
    private Long casetype;

    @ApiModelProperty(value = "公告或油画播放时间间隔:(0:默认;1:紧急;大于1:指定时间,单位分钟)")
    @TableField("showtype")
    private Long showtype;

    @ApiModelProperty(value = "每张图片展示时间（秒）")
    @TableField("showtime")
    private Long showtime;

    @ApiModelProperty(value = "公共库图片展示数量")
    @TableField("pubcount")
    private Long pubcount;

    @ApiModelProperty(value = "课桌拍照展示数量")
    @TableField("tablecount")
    private Long tablecount;

    @ApiModelProperty(value = "自定义图片展示数量")
    @TableField("selfcount")
    private Long selfcount;

    @ApiModelProperty(value = "0 随机选择 1 按最新选择")
    @TableField("selecttype")
    private Long selecttype;

    @ApiModelProperty(value = "背景模式 0 公共 1指定mid")
    @TableField("bktype")
    private Long bktype;

    @ApiModelProperty(value = "背景选择数量")
    @TableField("bkcount")
    private Long bkcount;

    @ApiModelProperty(value = "背景模式图片切换间隔")
    @TableField("backtime")
    private Long backtime;

    @ApiModelProperty(value = "书柜指定默认首页")
    @TableField("backpage")
    private Long backpage;

    @ApiModelProperty(value = "整体模式时候用公共图片还是桌子图片")
    @TableField("familytype")
    private Long familytype;

    @ApiModelProperty(value = "入库时间")
    @TableField("intime")
    private String intime;

    @ApiModelProperty(value = "keyimgtimeout")
    @TableField("keyimgtimeout")
    private Long keyimgtimeout;

    @ApiModelProperty(value = "绑定的主题id")
    @TableField("themeId")
    private Long themeid;

    @ApiModelProperty(value = "给油画屏使用的当主题有更新时更新时间")
    @TableField("updateTime")
    private String updateTime;

    @ApiModelProperty(value = "绑定的功能  1主题展示 2随走随荐随学 3热门图书、新书推荐 4报纸热门头条  5期刊热门头条 6公告服务")
    @TableField("gongneng")
    private Long gongneng;















}
