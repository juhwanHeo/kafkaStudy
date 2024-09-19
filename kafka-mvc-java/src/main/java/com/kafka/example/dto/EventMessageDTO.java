package com.kafka.example.dto;

import java.io.Serializable;

public record EventMessageDTO<T>(
    String id,
    T message
) implements Serializable {

}
