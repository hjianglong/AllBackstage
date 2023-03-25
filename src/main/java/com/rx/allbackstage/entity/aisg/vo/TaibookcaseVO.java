package com.rx.allbackstage.entity.aisg.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TaibookcaseVO {

    @ApiModelProperty(value = "cid")
    @TableField("cid")
    private Long cid;

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

    @ApiModelProperty(value = "intime")
    @TableField("intime")
    private String intime;


}
