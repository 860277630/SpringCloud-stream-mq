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
public class SimpleDemoSendApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleDemoSendApplication.class,args);
    }
}
