package org.example.Dto;

import java.util.List;

public class AIResponse {

    private String title;
    private List<String> strengths;
    private List<String> improvements;
    private String advice;

    // Constructors
    public AIResponse() {}

    public AIResponse(String title, List<String> strengths, List<String> improvements, String advice) {
        this.title = title;
        this.strengths = strengths;
        this.improvements = improvements;
        this.advice = advice;
    }

    // For error messages
    public AIResponse(String errorMessage) {
        this.title = "Error";
        this.strengths = List.of();
        this.improvements = List.of();
        this.advice = errorMessage;
    }

    // Getters and Setters
    // (You can generate them using Lombok if you want)
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public List<String> getStrengths() { return strengths; }
    public void setStrengths(List<String> strengths) { this.strengths = strengths; }

    public List<String> getImprovements() { return improvements; }
    public void setImprovements(List<String> improvements) { this.improvements = improvements; }

    public String getAdvice() { return advice; }
    public void setAdvice(String advice) { this.advice = advice; }
}
