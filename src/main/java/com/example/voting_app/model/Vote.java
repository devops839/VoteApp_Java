package com.example.voting_app.model;

public class Vote {

    private String option;
    private int count;

    public Vote(String option, int count) {
        this.option = option;
        this.count = count;
    }

    public String getOption() {
        return option;
    }

    public int getCount() {
        return count;
    }

    public void incrementCount() {
        this.count++;
    }
}
