package org.example.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 *  自定义的 一个 rabbitMQ 生产者
 */
public interface MyKafkaSource {
    String MYKAFKA_OUTPUT = "mykafka_output";

    @Output(MYKAFKA_OUTPUT)
    MessageChannel mykafkaOutput();
}
