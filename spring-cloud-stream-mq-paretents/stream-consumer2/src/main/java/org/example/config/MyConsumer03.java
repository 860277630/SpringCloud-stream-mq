package org.example.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MyConsumer03 {
    String MY_CONSUMER03 = "my_consumer03";

    @Input(MY_CONSUMER03)
    SubscribableChannel myConsumer03();
}
