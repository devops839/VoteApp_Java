package com.example.voting_app.service;

import com.example.voting_app.repository.VoteRepository;
import com.example.voting_app.model.Vote;
import org.springframework.stereotype.Service;

import java.util.List;  // Add this import statement
import java.util.ArrayList;  // Add this import statement

@Service
public class VotingService {

    private final VoteRepository voteRepository;

    public VotingService(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    public void voteForOption(String option) {
        voteRepository.incrementVote(option);
    }

    public List<Vote> getAllVotes() {
        return voteRepository.getAllVotes();
    }
}
