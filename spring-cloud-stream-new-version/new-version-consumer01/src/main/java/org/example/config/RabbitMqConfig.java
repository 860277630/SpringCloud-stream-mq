package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @program: spring-cloud-stream-new-version
 * @description:
 * @author: wjl
 * @create: 2023-06-14 21:00
 **/
@Configuration
public class RabbitMqConfig {

    @Bean
    public Consumer<String> rabbitconsumer01(){
        return message->{
            System.out.println("===========consumer02_stage_01:"+message+"=========");
        };
    }

    @Bean
    public Consumer<String> rabbitconsumer02(){
        return message->{
            System.out.println("===========consumer02_stage_01:"+message+"=========");
        };
    }
    @Bean
    public Function<String,String> rabbitconsumer03(){
        return message->{
            System.out.println("===========consumer01_stage_01:"+message+"=========");
            return message+"!";
        };
    }

    @Bean
    public Function<String,String> rabbitconsumer04(){
        return message->{
            System.out.println("===========consumer02_stage_01:"+message+"=========");
            return message+"!";
        };
    }


    @Bean
    public Consumer<String> rabbitconsumer05(){
        return message->{
            System.out.println("===========consumer02_stage_01:"+message+"=========");
        };
    }

    @Bean
    public Consumer<String> rabbitconsumer06(){
        return message->{
            System.out.println("===========consumer02_stage_01:"+message+"=========");
        };
    }

    @Bean
    public Consumer<String> rabbitconsumer07(){
        return message->{
            System.out.println("===========consumer02_stage_01:"+message+"=========");
        };
    }
}
