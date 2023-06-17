package org.example.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;


public interface MyKafkaSource02 {
    String MYKAFKA_OUTPUT = "mykafka_output02";

    @Output(MYKAFKA_OUTPUT)
    MessageChannel mykafkaOutput();
}
