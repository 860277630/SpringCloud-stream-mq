package org.example.sc3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import reactor.util.function.Tuple2;

import java.time.chrono.MinguoEra;
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

    @Bean
    public Function<Tuple2<Flux<String>,Flux<String>>,Flux<String>> gather(){
        return tuple->{
            Flux<String> t1 = tuple.getT1();
            Flux<String> t2 = tuple.getT2();
            Flux<String> merge = Flux.merge(t1, t2);
            Flux<String> f3 = Flux.combineLatest(t1, t2, (str1, str2) -> str1 + ":" + str2);
            return f3;
           // return merge;
        };
    }
}
