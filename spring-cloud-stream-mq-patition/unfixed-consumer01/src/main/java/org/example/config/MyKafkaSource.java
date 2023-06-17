package org.example.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;


public interface MyKafkaSource {
    String MYKAFKA_OUTPUT = "mykafka_output";

    @Output(MYKAFKA_OUTPUT)
    MessageChannel mykafkaOutput();
}
