package com.kafka.service;

import com.kafka.dto.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaConsumerService {

//    @KafkaListener(topics = "testTopic", groupId = "group-id-test", containerFactory = "userListener")
//    public void consume(String message) throws IOException {
//        System.out.println("receive message: " + message);
//    }


    @KafkaListener(topics = "testTopic", groupId = "group-id-test", containerFactory = "userListener")
    public void consume(User user) throws IOException {
        System.out.println("receive user: " + user);
    }
}
