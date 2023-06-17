package org.example.test;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.util.function.Tuple2;
import reactor.util.function.Tuple4;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @program: spring-cloud-stream-new-version
 * @description:
 * @author: wjl
 * @create: 2023-06-15 14:32
 **/
public class Test02 {

    @Test
    public void test01(){

        System.out.println(func01().get());

        System.out.println(func02().apply("hello world"));
        func03().accept("hello world");

    }

    public Supplier<String> func01(){
        return ()->{
            String message = "hello world";
            return message;
        };
    }

    public Function<String,String> func02(){
        return message->{
            return message+"!";
        };
    }

    public Consumer<String> func03(){
        return message->{
            System.out.println("===========received:"+message+"=========");
        };
    }

    public Function<Tuple2<Flux<String>,Flux<String>>,Flux<String>> func04(){
        return tuple->{
            Flux<String> t1 = tuple.getT1();
            Flux<String> t2 = tuple.getT2();
            //对 t1 t2两个入参进行合并操作， 并返回结果f3
            Flux<String> f3 = Flux.combineLatest(t1, t2, (str1, str2) -> str1 + ":" + str2);
            return f3;
        };
    }

    public Function<Tuple4<Flux<String>,Flux<String>,Flux<String>,Flux<String>>,Flux<String>> func05(){
        return tuple->{
            Flux<String> t1 = tuple.getT1();
            Flux<String> t2 = tuple.getT2();
            Flux<String> t3 = tuple.getT3();
            Flux<String> t4 = tuple.getT4();
            //对 t1 t2两个入参进行合并操作， 并返回结果f3
            Flux<String> f3 = Flux.combineLatest(t1, t2, (str1, str2) -> str1 + ":" + str2);
            Flux<String> f4 = Flux.combineLatest(t3, t4, (str1, str2) -> str1 + ":" + str2);
            Flux<String> f5 = Flux.combineLatest(f3, f4, (str1, str2) -> str1 + ":" + str2);
            return f5;
        };
    }

}
