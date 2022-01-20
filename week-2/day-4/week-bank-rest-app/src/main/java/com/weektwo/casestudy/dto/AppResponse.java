package com.weektwo.casestudy.dto;

public class AppResponse<T> {

    public enum Types {

        SUCCESS("success"),
        FAIL("fail");

        private final String typ;

        Types(String type) {
            this.typ = type;
        }

        @Override
        public String toString() {
            return typ;
        }
    }

    private String sts;
    private String msg;
    private T body;

    public String getSts() {
        return sts;
    }

    public void setSts(String sts) {
        this.sts = sts;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
