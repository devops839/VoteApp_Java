package com.example.voting_app.model;

public class Vote {

    private String option;  // Movie genre (Action/Adventure, Rom-Com, Horror)
    private int count;      // Vote count

    // Constructor
    public Vote(String option, int count) {
        this.option = option;
        this.count = count;
    }

    // Getter for the 'option' field
    public String getOption() {
        return option;
    }

    // Getter for the 'count' field
    public int getCount() {
        return count;
    }

    // Method to increment the vote count
    public void incrementCount() {
        this.count++;
    }
}
