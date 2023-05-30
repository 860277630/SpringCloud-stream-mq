package org.example.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MyKafkaSink {
    String MYKAFKA_INPUT = "mykafka_input";

    @Input(MYKAFKA_INPUT)
    SubscribableChannel mykafkaInput();
}
