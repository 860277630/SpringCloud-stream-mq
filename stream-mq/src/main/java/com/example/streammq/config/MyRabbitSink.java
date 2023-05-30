package com.example.streammq.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MyRabbitSink {
    String MYRABBITMQ_INPUT = "myrabbitmq_input";

    @Input(MYRABBITMQ_INPUT)
    SubscribableChannel myrabbitmqinput();
}
