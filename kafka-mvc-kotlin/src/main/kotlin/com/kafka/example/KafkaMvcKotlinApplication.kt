package com.kafka.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaMvcKotlinApplication

fun main(args: Array<String>) {
    runApplication<KafkaMvcKotlinApplication>(*args)
}
