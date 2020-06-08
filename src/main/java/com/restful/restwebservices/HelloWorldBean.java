package com.restful.restwebservices;

public class HelloWorldBean {
    private String Message;

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public HelloWorldBean(String msg){
        super();
        this.Message = msg;
    }
}

