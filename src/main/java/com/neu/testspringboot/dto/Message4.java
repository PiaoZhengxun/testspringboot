package com.neu.testspringboot.dto;

public class Message4 {

    public Message4(Integer statusCode, String msg) {
        this.statusCode = statusCode;
        this.msg = msg;
    }
    public static Message4 notFind(String msg){
        return new Message4(400, msg);
    }
    public static Message4 notFind(Integer statusCode, String msg){
        return new Message4(statusCode, msg);
    }
    public static Message4 error(String msg){
        return new Message4(500, msg);
    }
    public static Message4 error(Integer statusCode, String msg){
        return new Message4(statusCode, msg);
    }

    public static Message4 ok(String msg, Object obj){
        return new Message4(200, msg, obj);
    }

    public static Message4 ok(Integer statusCode, String msg, Object obj){
        return new Message4(statusCode, msg, obj);
    }

    public Message4(Integer statusCode, String msg, Object obj){
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
