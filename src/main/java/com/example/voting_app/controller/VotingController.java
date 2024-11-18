package com.example.voting_app.controller;

import com.example.voting_app.model.Candidate;
import com.example.voting_app.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vote")
public class VoteController {

    @Autowired
    private CandidateRepository candidateRepository;

    // Get a list of all candidates
    @GetMapping("/candidates")
    public List<Candidate> getAllCandidates() {
        return candidateRepository.findAll();
    }

    // Cast a vote for a candidate
    @PostMapping("/vote")
    public String vote(@RequestParam Long candidateId) {
        Candidate candidate = candidateRepository.findById(candidateId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid candidate ID"));
        candidate.setVotes(candidate.getVotes() + 1);
        candidateRepository.save(candidate);
        return "Vote successfully cast for " + candidate.getName();
    }
}
