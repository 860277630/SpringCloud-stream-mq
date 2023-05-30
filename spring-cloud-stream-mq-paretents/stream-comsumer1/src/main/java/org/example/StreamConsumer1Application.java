package org.example;

import org.example.config.MyConsumer02;
import org.example.config.MyProducter02;
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
@EnableBinding({Source.class, Sink.class, MyProducter02.class, MyConsumer02.class})
public class StreamConsumer1Application {
    public static void main(String[] args) {
        SpringApplication.run(StreamConsumer1Application.class,args);
    }
}
