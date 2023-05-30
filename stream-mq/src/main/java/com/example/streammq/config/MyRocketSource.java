package com.example.streammq.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 *  自定义的 一个 rabbitMQ 生产者
 */
public interface MyRocketSource {
    String MYROCKETMQ_OUTPUT = "myrocketmq_output";

    @Output(MYROCKETMQ_OUTPUT)
    MessageChannel myrocketmqoutput();
}
