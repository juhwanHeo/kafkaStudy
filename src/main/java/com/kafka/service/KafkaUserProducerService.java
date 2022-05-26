package com.kafka.service;

import com.kafka.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


/*
* kafka Json 데이터 전송
* 참고: https://www.skyer9.pe.kr/wordpress/?p=1550
* */
@Service
public class KafkaUserProducerService {

    private final KafkaTemplate<String, User> kafkaTemplateUser;

    @Autowired
    public KafkaUserProducerService(KafkaTemplate<String, User> kafkaTemplateUser) {
        this.kafkaTemplateUser = kafkaTemplateUser;
    }

    public void sendUser(User user)  {
        System.out.println("send user: " + user);
        kafkaTemplateUser.send("testTopic", user);
    }
}
