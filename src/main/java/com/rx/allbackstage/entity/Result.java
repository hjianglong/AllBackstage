package com.rx.allbackstage.entity;


import lombok.Data;

@Data
public class Result<T> {

    private boolean status;

    private String msg;

    private T result;

    private String num;


    public Result(boolean flag, String describe) {
        this.status = flag;
        this.msg = describe;
        this.result = null;
    }

    public Result(boolean flag, String describe, T result) {
        this.status = flag;
        this.msg = describe;
        this.result = result;
    }
    public Result(boolean flag, String describe, T result, String num) {
        this.status = flag;
        this.msg = describe;
        this.result = result;
        this.num = num;
    }
}
