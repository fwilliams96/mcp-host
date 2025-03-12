package com.example.mpc_host;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.mcp.SyncMcpToolCallbackProvider;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ChatbotConfiguration {

//    @Bean
//    ChatClient chatClient(ChatModel chatModel,   toolCallbackProvider) {
//        return ChatClient
//                .builder(chatModel)
//                .defaultTools(toolCallbackProvider.getToolCallbacks())
//                .build();
//    }

    @Bean
    public ChatClient chatClient(ChatClient.Builder chatClientBuilder, ToolCallbackProvider tools) {
        return chatClientBuilder
                .defaultTools(tools)
                .build();
    }

}
