package com.rx.allbackstage.entity.yhp.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("关键字和他的图片")
@TableName("yhp_oilpainting_keyimg")
public class YhpoilpaintingkeyimgVO {

    @ApiModelProperty(value = "cid")
    @TableField("cid")
    private Long cid;

    @ApiModelProperty(value = "资源数据")
    @TableField("img")
    private String img;

    @ApiModelProperty(value = "入库时间")
    @TableField("intime")
    private String intime;

    @ApiModelProperty(value = "资源类型")
    @TableField("filetype")
    private String filetype;

}
