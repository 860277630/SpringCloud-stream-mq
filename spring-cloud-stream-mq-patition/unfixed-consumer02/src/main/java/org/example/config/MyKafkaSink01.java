package org.example.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MyKafkaSink01 {
    String MYKAFKA_INPUT01 = "mykafka_input01";

    @Input(MYKAFKA_INPUT01)
    SubscribableChannel mykafkaInput01();
}
