package com.example.voting_app.model;

public class Vote {

    private String option;  // This will store the movie genre name
    private int count;      // This will store the vote count

    // Constructor
    public Vote(String option, int count) {
        this.option = option;
        this.count = count;
    }

    // Getter for the 'option' field (movie genre)
    public String getOption() {
        return option;
    }

    // Getter for the 'count' field (vote count)
    public int getCount() {
        return count;
    }

    // Method to increment the vote count
    public void incrementCount() {
        this.count++;
    }
}
