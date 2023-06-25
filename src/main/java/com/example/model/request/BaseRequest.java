package com.example.model.request;

import java.time.LocalDate;

public class BaseRequest {

    private long userId;

    private LocalDate date;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
