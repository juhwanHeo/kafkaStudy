package com.kafka.service;

import com.kafka.dto.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class KafkaUserProducerServiceTest {

    @Autowired
    private KafkaUserProducerService kafkaUserProducerService;

    @Test
    public void sendUserTest() {

        User user = User.builder()
                .id("gjwnghks99")
                .name("heo juhwan")
                .build();

        kafkaUserProducerService.sendUser(user);
    }
}