package com.example.voting_app.model;

public class Vote {

    private String genre;
    private int count;

    public Vote(String genre, int count) {
        this.genre = genre;
        this.count = count;
    }

    // Getters and Setters
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
