package org.example.Dto;

public class ResumeRequest {
    private String resumeText;

    public ResumeRequest() {}

    public ResumeRequest(String resumeText) {
        this.resumeText = resumeText;
    }

    public String getResumeText() {
        return resumeText;
    }

    public void setResumeText(String resumeText) {
        this.resumeText = resumeText;
    }
}
