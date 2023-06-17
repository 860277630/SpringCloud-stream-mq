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
public class HandleFlowConfig {

    @Bean
    public Consumer<String> selffun6(){
        return message->{
            System.out.println("===========selffun6:"+message+"=========");
        };
    }
}
