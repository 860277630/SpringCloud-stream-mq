package org.example.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;


public interface MyKafkaSource01 {
    String MYKAFKA_OUTPUT = "mykafka_output01";

    @Output(MYKAFKA_OUTPUT)
    MessageChannel mykafkaOutput();
}
