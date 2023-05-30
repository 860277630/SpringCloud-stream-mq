package org.example.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MyConsumer02 {
    String MY_CONSUMER02 = "my_consumer02";

    @Input(MY_CONSUMER02)
    SubscribableChannel myConsumer02();
}
