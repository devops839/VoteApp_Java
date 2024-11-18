package com.example.voting_app.service;

import com.example.voting_app.repository.VoteRepository;
import org.springframework.stereotype.Service;

@Service
public class VotingService {

    private final VoteRepository voteRepository;

    public VotingService(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    public void voteForOption(String option) {
        voteRepository.incrementVote(option);
    }

    public List<com.example.voting_app.model.Vote> getAllVotes() {
        return voteRepository.getAllVotes();
    }
}
