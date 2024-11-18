package com.example.voting_app.model;

public class Vote {
    private String option;
    private int count;

    public Vote(String option) {
        this.option = option;
        this.count = 0;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void incrementCount() {
        this.count++;
    }
}
