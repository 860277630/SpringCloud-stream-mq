package org.example;

import org.example.config.MyConsumer01;
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
@EnableBinding({MyConsumer01.class})
public class FixConsumer02Application {
    public static void main(String[] args) {
        SpringApplication.run(FixConsumer02Application.class,args);
    }
}
