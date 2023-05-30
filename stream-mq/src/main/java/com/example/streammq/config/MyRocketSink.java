package com.example.streammq.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MyRocketSink {
    String MYROCKETMQ_INPUT = "myrocketmq_input";

    @Input(MYROCKETMQ_INPUT)
    SubscribableChannel myrocketmqinput();
}
