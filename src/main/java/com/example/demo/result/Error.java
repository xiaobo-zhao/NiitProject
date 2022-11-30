package com.example.demo.result;

public class Error {
    private int code;		// 状态码
    private String msg;		// 返回的信息

    private Error(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    // 静态常用异常
    public static Error ERROR_1 = new Error(400,"异常类型一");
    public static Error ERROR_2 = new Error(500,"异常类型二");

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

