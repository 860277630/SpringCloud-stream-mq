package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @program: spring-cloud-stream-new-version
 * @description: kafka配置
 * @author: wjl
 * @create: 2023-06-14 20:31
 **/
@Configuration
public class KafkaConfig {

    @Bean
    public Function<String,String> kafkaconsumer01(){
        return message->{
            System.out.println("===========consumer01_stage_01:"+message+"=========");
            return message+"!";
        };
    }

    @Bean
    public Consumer<String> kafkaconsumer02(){
        return message->{
            System.out.println("===========consumer02_stage_01:"+message+"=========");
        };
    }

    @Bean
    public Consumer<String> kafkaconsumer01last(){
        return message->{
            System.out.println("===========consumer01_stage_02:"+message+"=========");
        };
    }

}
