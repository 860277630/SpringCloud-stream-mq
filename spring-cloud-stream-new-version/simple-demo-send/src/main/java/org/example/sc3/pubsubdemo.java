package org.example.sc3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @program: spring-cloud-stream-new-version
 * @description:
 * @author: wjl
 * @create: 2023-05-19 20:20
 **/
@Configuration
public class pubsubdemo {

    @Bean
    public Supplier<String> source(){
        return ()->{
            String message = "from source";
            System.out.println("===========from source=============");
            return message;
        };
    }
    @Bean
    public Function<String,String> transfer(){
        return message->{
            System.out.println("==========transfer:"+message+"=========");
            return "transfer:"+message;
        };
    }
    @Bean
    public Consumer<String> sink(){
        return message->{
            System.out.println("===========at sink:"+message+"=============");
        };
    }

}
