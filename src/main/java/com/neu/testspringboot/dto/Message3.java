package com.neu.testspringboot.dto;

public class Message3 {

    public static Message3 getMessage3(Integer statusCode, String msg, Object obj){
        return new Message3(statusCode, msg, obj);

    }

    public Message3(Integer statusCode, String msg, Object obj){
        this.statusCode = statusCode;
        this.msg = msg;
        this.obj = obj;
    }
    private Integer statusCode;
    private String msg;
    private Object obj;

    @Override
    public String toString() {
        return "Message2{" +
                "statusCode=" + statusCode +
                ", msg='" + msg + '\'' +
                ", obj=" + obj +
                '}';
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
