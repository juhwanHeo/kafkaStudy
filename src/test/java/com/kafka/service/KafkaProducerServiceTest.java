package com.kafka.service;

import com.kafka.dto.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class KafkaProducerServiceTest {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @Test
    public void sendMessageTest() {
//        String message = "send message test - service!!";
//
//        kafkaProducerService.sendMessage(message);
    }

}
