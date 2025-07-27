package org.example.controller;

import org.example.Dto.AIResponse;
import org.example.Dto.ResumeRequest;
import org.example.service.AIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/resume")
@CrossOrigin
public class ResumeController {

    @Autowired
    private AIService aiService;

    @PostMapping("/analyze")
    public AIResponse analyze(@RequestBody ResumeRequest request) {
        try {
            return aiService.analyzeText(request.getResumeText());
        } catch (Exception e) {
            return new AIResponse("Internal Server Error: " + e.getMessage());
        }
    }

}
