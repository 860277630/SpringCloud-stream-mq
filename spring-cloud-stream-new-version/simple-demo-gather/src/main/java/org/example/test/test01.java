package org.example.test;

import reactor.core.publisher.Flux;

/**
 * @program: spring-cloud-stream-new-version
 * @description:
 * @author: wjl
 * @create: 2023-05-21 17:28
 **/
public class test01 {
    public static void main(String[] args) {
        Flux<String> f1 = Flux.just("a", "b", "c");
        f1.subscribe(System.out::println);
        Flux<String> f2 = Flux.just("1", "2", "3");
        f2.subscribe(System.out::println);
        System.out.println("========================");
        Flux<String> f3 = Flux.combineLatest(f1, f2, (str1, str2) -> str1 + ":" + str2);
        f3.subscribe(System.out::println);
        Flux<String> f4 = Flux.merge(f1, f2);
        f4.subscribe(System.out::println);
    }
}
