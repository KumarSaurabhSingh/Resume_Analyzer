📄 AI-Powered Resume Analyzer

An AI-powered Spring Boot application that analyzes resumes and provides structured, detailed feedback.
It helps job seekers improve their resumes by highlighting strengths, weaknesses, and actionable advice.

🚀 Features

    ✅ Upload or paste resume text for analysis
    
    ✅ Uses OpenRouter AI API (free GPT models)
    
    ✅ Returns structured JSON with:
    
    title → One-line summary of the candidate’s profile
    
    strengths → 4–6 key strong points
    
    improvements → 4–6 improvement suggestions
    
    advice → Personalized career guidance
    
    ✅ Built with Java 22 + Spring Boot
    
    ✅ REST API endpoints for easy integration with frontend

🛠️ Tech Stack

    Backend: Java 22, Spring Boot
    
    API Integration: OpenRouter (AI Models)
    
    JSON Handling: Jackson
    
    HTTP Client: RestTemplate (Spring)
    
    Logging: SLF4J + Logback

📂 Project Structure

    Resume_Analyzer/
    │── src/main/java/org/example
    │   ├── controller/        # REST Controllers
    │   ├── service/           # Business Logic (AI Service)
    │   ├── dto/               # Data Transfer Objects (AIResponse)
    │   └── ResumeAnalyzerApp  # Main Spring Boot App
    │
    │── src/main/resources/
    │   ├── application.yml    # API Keys & Config
    │
    │── README.md              # Project Documentation
    │── pom.xml                # Maven Dependencies

🔑 Setup & Installation

  1. Clone the repo

    git clone https://github.com/KumarSaurabhSingh/Resume_Analyzer.git
    cd Resume_Analyzer


2. Configure API Keys
    Add your OpenRouter API key in application.yml:

        openrouter:
          api:
            key: YOUR_API_KEY
            url: https://openrouter.ai/api/v1/chat/completions
            model: openai/gpt-3.5-turbo


3. Build & Run

        mvn clean install
        mvn spring-boot:run


4. API Usage
        Send a POST request:
        
        curl -X POST "http://localhost:8080/api/analyze" \
        -H "Content-Type: application/json" \
        -d '{"resumeText": "Your resume content here"}'

📊 Example Response

    {
      "title": "Java Backend Developer with Automation Expertise",
      "strengths": [
        "Strong knowledge of Java & Spring Boot",
        "Hands-on experience with databases",
        "Good problem-solving skills",
        "Exposure to automation testing frameworks"
      ],
      "improvements": [
        "Add measurable achievements in work experience",
        "Highlight open-source contributions",
        "Include cloud technologies like AWS/GCP",
        "Refine project descriptions with impact metrics"
      ],
      "advice": "Your resume is strong in technical skills but needs quantifiable achievements. Focus on showcasing impact, contributions, and cloud exposure."
    }

📌 Future Enhancements

     Web-based UI for uploading resumes
     Support for PDF/DOCX file parsing
 Job-role-specific resume feedback

 ATS (Applicant Tracking System) score simulation
