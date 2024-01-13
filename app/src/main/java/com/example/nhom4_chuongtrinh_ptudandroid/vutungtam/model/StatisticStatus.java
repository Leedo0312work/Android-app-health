package com.example.nhom4_chuongtrinh_ptudandroid.vutungtam.model;

public class StatisticStatus {
    private String status;
    private Float percent;

    public StatisticStatus() {
    }

    public StatisticStatus(String status, Float percent) {
        this.status = status;
        this.percent = percent;
    }

    public String getStatus() {
        return status;
    }

    public Float getPercent() {
        return percent;
    }

}
