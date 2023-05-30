package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: spring-cloud-stream-mq-patition
 * @description:
 * @author: wjl
 * @create: 2023-05-17 20:40
 **/
@SpringBootApplication
public class NewVersionConsumer01Application {
    public static void main(String[] args) {
        SpringApplication.run(NewVersionConsumer01Application.class,args);
    }
}
