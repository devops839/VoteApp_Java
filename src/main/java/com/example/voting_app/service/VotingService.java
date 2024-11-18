package com.example.voting_app.service;

import com.example.voting_app.model.Vote;
import com.example.voting_app.repository.VoteRepository;

import java.util.List;

public class VotingService {

    private final VoteRepository voteRepository = new VoteRepository();

    // Method to get all votes
    public List<Vote> getAllVotes() {
        return voteRepository.getVotes();
    }

    // Method to increment the vote for a selected genre
    public void voteForGenre(String genre) {
        voteRepository.incrementVote(genre);
    }
}
