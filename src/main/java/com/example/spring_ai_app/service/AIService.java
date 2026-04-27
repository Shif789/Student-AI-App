package com.example.spring_ai_app.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Slf4j
public class AIService {
    private final ChatClient chatClient;

    public AIService(OllamaChatModel chatModel) {
        this.chatClient = ChatClient.create(chatModel);
    }

    public String getAIResponse(String prompt) {
//         return chatClient
//                .prompt(prompt)
//                .call()
//                .content();
        ChatResponse chatResponse = Objects.requireNonNull(chatClient.prompt(prompt).call().chatResponse());
        log.info("llm model used is: {}", chatResponse.getMetadata().getModel());

        String response = chatResponse.getResult().getOutput().getText();
        return response;
    }
}
