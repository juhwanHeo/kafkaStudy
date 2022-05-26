package com.kafka.controller;

import com.kafka.service.KafkaProducerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@SpringBootTest
@AutoConfigureMockMvc
public class KafkaProducerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void sendMessageTest() throws Exception {
        String message = "send message test - controller !!";
        MultiValueMap<String, String> requestParam = new LinkedMultiValueMap<>();
        requestParam.set("message", message);

        RequestBuilder reqBuilder = MockMvcRequestBuilders
                .post("/send-message")
                .params(requestParam);

        mockMvc.perform(reqBuilder)
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

}
