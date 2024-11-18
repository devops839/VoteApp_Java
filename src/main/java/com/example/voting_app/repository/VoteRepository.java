package com.example.voting_app.repository;

import com.example.voting_app.model.Vote;
import java.util.ArrayList;
import java.util.List;

public class VoteRepository {

    // List to hold the votes
    private static final List<Vote> votes = new ArrayList<>();

    // Initialize with 3 options (Action/Adventure, Rom-Com, Horror)
    static {
        votes.add(new Vote("Action/Adventure", 0));
        votes.add(new Vote("Rom-Com", 0));
        votes.add(new Vote("Horror", 0));
    }

    // Get the list of all votes
    public List<Vote> getVotes() {
        return votes;
    }

    // Increment the vote count for a particular genre
    public void incrementVote(String genre) {
        for (Vote vote : votes) {
            if (vote.getOption().equalsIgnoreCase(genre)) {
                vote.incrementCount();
            }
        }
    }
}
