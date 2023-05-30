package org.example.consumer;

import org.example.config.MyConsumer02;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

/**
 * @program: stream-mq-group
 * @description:
 * @author: wjl
 * @create: 2023-05-16 18:01
 **/
@Component
public class MqConsumer {

    @StreamListener(Sink.INPUT)
    public void process1(Object message){
        System.out.println("Sink receive message from groupA:"+message);
    }


    @StreamListener(MyConsumer02.MY_CONSUMER02)
    public void process2(Object message){
        System.out.println("MyConsumer02 receive message1  from groupB:"+message);
    }
}
