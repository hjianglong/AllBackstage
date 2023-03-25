package com.rx.allbackstage.entity.aisg.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("自动申请购买图书")
@TableName("t_aibookcase_request_auto")
public class TaibookcaserequestautoDTO {

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

    @ApiModelProperty(value = "图书简介")
    @TableField("bookabout")
    private String bookabout;

    @ApiModelProperty(value = "图书发表时间")
    @TableField("booktime")
    private String booktime;

    @ApiModelProperty(value = "图片原图")
    @TableField("bookimage")
    private String bookimage;

    @ApiModelProperty(value = "图书缩略图")
    @TableField("bookthumb")
    private String bookthumb;

    @ApiModelProperty(value = "intime")
    @TableField("intime")
    private String intime;
}
