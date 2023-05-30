package org.example.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MyConsumer01 {
    String MY_CONSUMER01 = "my_consumer01";

    @Input(MY_CONSUMER01)
    SubscribableChannel myConsumer01();
}
