package com.example.voting_app.repository;

import com.example.voting_app.model.Vote;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VoteRepository {

    private List<Vote> votes = new ArrayList<>();

    public VoteRepository() {
        // Add some default vote options
        votes.add(new Vote("Option 1"));
        votes.add(new Vote("Option 2"));
        votes.add(new Vote("Option 3"));
    }

    public List<Vote> getAllVotes() {
        return votes;
    }

    public void incrementVote(String option) {
        for (Vote vote : votes) {
            if (vote.getOption().equals(option)) {
                vote.incrementCount();
            }
        }
    }
}
