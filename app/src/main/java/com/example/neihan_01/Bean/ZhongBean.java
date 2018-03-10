package com.example.neihan_01.Bean;



public class ZhongBean<T> {

    private String message;
    private T data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ZhongBean{" +
                "message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
