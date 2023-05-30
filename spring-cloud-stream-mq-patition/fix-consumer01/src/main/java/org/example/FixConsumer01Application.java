package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;

/**
 * @program: spring-cloud-stream-mq-patition
 * @description:
 * @author: wjl
 * @create: 2023-05-17 20:40
 **/
@SpringBootApplication
@EnableBinding({Source.class, Sink.class})
public class FixConsumer01Application {
    public static void main(String[] args) {
        SpringApplication.run(FixConsumer01Application.class,args);
    }
}
