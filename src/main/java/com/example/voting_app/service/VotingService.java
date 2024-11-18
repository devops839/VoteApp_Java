package com.example.voting_app.service;

import com.example.voting_app.model.Vote;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VotingService {

    // In-memory storage for vote counts (will reset on app restart or page refresh)
    private List<Vote> votes = new ArrayList<>();

    public VotingService() {
        // Initialize with default genres and 0 votes
        votes.add(new Vote("Action/Adventure", 0));
        votes.add(new Vote("Rom-Com", 0));
        votes.add(new Vote("Horror", 0));
    }

    // Method to get the list of votes
    public List<Vote> getVotes() {
        return votes;
    }

    // Method to cast a vote
    public void castVote(String option) {
        for (Vote vote : votes) {
            // Ensure the Vote object has the 'option' field, and compare the option
            if (vote.getOption().equalsIgnoreCase(option)) {
                vote.incrementCount();
                break;
            }
        }
    }
}
