package org.example;

import org.example.config.MyConsumer01;
import org.example.config.MyConsumer03;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;

/**
 * @program: spring-cloud-stream-mq-paretents
 * @description:
 * @author: wjl
 * @create: 2023-05-17 11:14
 **/
@SpringBootApplication
@EnableBinding({MyConsumer01.class, MyConsumer03.class})
public class StreamConsumer2Application {
    public static void main(String[] args) {
        SpringApplication.run(StreamConsumer2Application.class,args);
    }
}
