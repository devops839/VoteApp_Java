package com.example.voting_app.controller;

import com.example.voting_app.service.VotingService;
import com.example.voting_app.model.Vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VotingController {

    @Autowired
    private VotingService votingService;

    // Display the voting page with genres and current vote counts
    @GetMapping("/")
    public String showVotingPage(Model model) {
        model.addAttribute("votes", votingService.getAllVotes());
        return "index";  // Return the HTML page to display voting options
    }

    // Handle the vote submission
    @PostMapping("/vote")
    public String vote(String option) {
        votingService.voteForOption(option);
        return "redirect:/";  // Redirect back to the voting page after vote
    }
}
