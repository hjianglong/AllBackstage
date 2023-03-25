package com.rx.allbackstage.entity.yhp.entiey;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("油画屏分类")
@TableName("yhp_oilpainting_fnelei")
public class Yhpoilpaintingfenlei {

    @ApiModelProperty(value = "自增id")
    @TableField("id")
    private Long id;

    @ApiModelProperty(value = "分类名")
    @TableField("fenlei")
    private String fenlei;

    @ApiModelProperty(value = "分类顺序")
    @TableField("fenleishunxu")
    private String fenleishunxu;

    @ApiModelProperty(value = "是否混合模式 0 否 1 是")
    @TableField("hunbe")
    private String hunbe;

    @ApiModelProperty(value = "播放时间")
    @TableField("fenleishijian")
    private String fenleishijian;

    @ApiModelProperty(value = "播放的主题id,例如1，2")
    @TableField("bofangzhuti")
    private String bofangzhuti;

    @ApiModelProperty(value = "主题播放时间")
    @TableField("zhutishijian")
    private String zhutishijian;













}
