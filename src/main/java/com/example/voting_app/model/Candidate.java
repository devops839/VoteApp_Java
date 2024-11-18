package com.example.voting_app.model;

@Entity
public class Candidate {

    @Id
    private Long id;
    private String name;
    private int votes;

    // Constructor
    public Candidate(Long id, String name) {
        this.id = id;
        this.name = name;
        this.votes = 0;  // Default vote count is 0
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }
}
