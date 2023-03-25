package com.rx.allbackstage.entity.aisg.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("新上架书柜图书表")
@TableName("t_aibookcase_new")
public class TaibookcasenewDTO {

    @ApiModelProperty(value = "书名")
    @TableField("bookname")
    private String bookname;

    @ApiModelProperty(value = "作者")
    @TableField("bookauthor")
    private String bookauthor;

    @ApiModelProperty(value = "出版社")
    @TableField("bookhouse")
    private String bookhouse;

    @ApiModelProperty(value = "分类")
    @TableField("bookclass")
    private String bookclass;

    @ApiModelProperty(value = "简介")
    @TableField("bookabout")
    private String bookabout;

    @ApiModelProperty(value = "上架时间")
    @TableField("booktime")
    private String booktime;

    @ApiModelProperty(value = "封面")
    @TableField("bookimage")
    private String bookimage;

    @ApiModelProperty(value = "mid")
    @TableField("mid")
    private String mid;

    @ApiModelProperty(value = "创建时间")
    @TableField("intime")
    private String intime;

}
