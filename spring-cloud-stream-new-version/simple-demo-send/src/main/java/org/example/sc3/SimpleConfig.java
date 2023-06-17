package org.example.sc3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import reactor.util.function.Tuple2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @program: spring-cloud-stream-new-version
 * @description:
 * @author: wjl
 * @create: 2023-06-15 23:10
 **/
@Configuration
public class SimpleConfig {

    @Bean
    public Supplier<String> selffun1(){
        return ()->{
            String message = "hello world01";
            System.out.println("===========selffun1=============");
            return message;
        };
    }

    @Bean
    public Supplier<String> selffun2(){
        return ()->{
            String message = "hello world02";
            System.out.println("===========selffun2=============");
            return message;
        };
    }

    @Bean
    public Function<Tuple2<Flux<String>,Flux<String>>,Flux<String>> selffun3(){
        return tuple->{
            Flux<String> t1 = tuple.getT1();
            Flux<String> t2 = tuple.getT2();
            Flux<String> f3 = Flux.combineLatest(t1, t2, (str1, str2) -> str1 + ":" + str2);
            return f3;
        };
    }

    @Bean
    public Function<String,String> selffun4(){
        return message->{
            System.out.println("===========selffun4:"+message+"=========");
            return message;
        };
    }

    @Bean
    public Consumer<String> selffun5(){
        return message->{
            System.out.println("===========selffun5:"+message+"=========");
        };
    }


}
