package com.kafka.example.controller;

import com.kafka.example.dto.EventMessageDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class HelloController {

  private final KafkaTemplate<String, EventMessageDTO<?>> kafkaTemplate;
  private final String TOPIC = "test-status-v1";

  @GetMapping
  public String helloSend(
      @RequestParam(value = "message", required = false) String message
  ) {
    final String hello = StringUtils.hasText(message) ? message : "hello";
    final EventMessageDTO<String> event = new EventMessageDTO<>("id-1", hello);

    log.info(">>> message: {}", message);
    kafkaTemplate.send(TOPIC, event)
        .whenComplete((result, throwable) -> {
          log.info(">>> whenComplete result: {}", result);
          log.info(">>> whenComplete throwable: {}", throwable.getMessage(), throwable);
        });
    return hello;
  }
}
