package com.kafka.controller;

import com.kafka.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class KafkaProducerController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping("/send-message")
    public ResponseEntity<?> sendMessage(
            @RequestParam(name = "message", defaultValue = "default!!") String message
    ) {
        Map<String, Object> result = new HashMap<>();

//        kafkaProducerService.sendMessage(message);

        return ResponseEntity.ok(result);
    }

}
