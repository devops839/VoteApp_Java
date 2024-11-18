package com.example.voting_app.controller;

import com.example.voting_app.service.VotingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VotingController {

    @Autowired
    private VotingService votingService;

    @GetMapping("/")
    public String getVotingPage(Model model) {
        model.addAttribute("votes", votingService.getVotes());
        return "index";
    }

    @PostMapping("/vote")
    public String castVote(@RequestParam String option, Model model) {
        votingService.castVote(option);
        model.addAttribute("votes", votingService.getVotes());
        return "index";
    }
}
