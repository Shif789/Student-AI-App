package com.example.spring_ai_app.controller;

import com.example.spring_ai_app.service.AIService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ai")
@CrossOrigin("*")
@Slf4j
public class OllamaAIController {

    private final AIService aiService;

    public OllamaAIController(AIService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/fetch/{prompt}")
    public ResponseEntity<String> fetchAIResponse(@PathVariable String prompt) {
        log.info("Fetching AI response");
        String response = aiService.getAIResponse(prompt);
        return ResponseEntity.ok("This is a response from Ollama AI for the prompt: " + response);
    }
}
