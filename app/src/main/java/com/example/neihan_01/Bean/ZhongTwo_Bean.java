package com.example.neihan_01.Bean;

import java.util.List;



public class ZhongTwo_Bean<T> {

    /**
     * has_more : true
     * has_new_message : false
     * max_time : 1515547850
     * min_time : 1515553550
     * tip : 20条新内容
     */
    private boolean has_more;
    private boolean has_new_message;
    private double max_time;
    private int min_time;
    private String tip;
    private List<T> data;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public boolean isHas_more() {
        return has_more;
    }

    public void setHas_more(boolean has_more) {
        this.has_more = has_more;
    }

    public boolean isHas_new_message() {
        return has_new_message;
    }

    public void setHas_new_message(boolean has_new_message) {
        this.has_new_message = has_new_message;
    }

    public double getMax_time() {
        return max_time;
    }

    public void setMax_time(double max_time) {
        this.max_time = max_time;
    }

    public int getMin_time() {
        return min_time;
    }

    public void setMin_time(int min_time) {
        this.min_time = min_time;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "ZhongTwo_Bean{" +
                "has_more=" + has_more +
                ", has_new_message=" + has_new_message +
                ", max_time=" + max_time +
                ", min_time=" + min_time +
                ", tip='" + tip + '\'' +
                ", data=" + data +
                '}';
    }
}
