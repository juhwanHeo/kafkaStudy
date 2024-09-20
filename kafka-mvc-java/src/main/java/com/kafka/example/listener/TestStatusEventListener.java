package com.kafka.example.listener;

import com.kafka.example.dto.EventMessageDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestStatusEventListener {

  @KafkaListener(topics = "test-status-v1", groupId = "java-group_id")
  public void consume(@Headers MessageHeaders headers, @Payload EventMessageDTO<String> eventMessageDTO) {
    log.info(">>> Consumed headers: {}", headers);
    log.info(">>> Consumed eventMessageDTO: {}", eventMessageDTO);
  }
}
