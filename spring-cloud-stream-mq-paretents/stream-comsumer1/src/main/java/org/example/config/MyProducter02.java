package org.example.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;


public interface MyProducter02 {
    String MY_PRODUCTER02 = "my_producter02";

    @Output(MY_PRODUCTER02)
    MessageChannel myProducter02();
}
