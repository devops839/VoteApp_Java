package com.example.voting_app.controller;

import com.example.voting_app.service.VotingService;
import com.example.voting_app.model.Vote;

import java.util.List;

public class VotingController {

    private final VotingService votingService = new VotingService();

    // Get all votes
    public List<Vote> getVotes() {
        return votingService.getAllVotes();
    }

    // Cast a vote for a specific genre
    public void castVote(String genre) {
        votingService.voteForGenre(genre);
    }
}
