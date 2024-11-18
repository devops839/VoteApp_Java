package com.example.voting_app.service;

import com.example.voting_app.model.Vote;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VotingService {

    private List<Vote> votes;

    public VotingService() {
        // Initialize with movie genre options
        votes = new ArrayList<>();
        votes.add(new Vote("Action/Adventure"));
        votes.add(new Vote("Rom-Com"));
        votes.add(new Vote("Horror"));
    }

    public List<Vote> getAllVotes() {
        return votes;
    }

    public void voteForOption(String option) {
        for (Vote vote : votes) {
            if (vote.getOption().equalsIgnoreCase(option)) {
                vote.incrementCount();
                break;
            }
        }
    }
}
