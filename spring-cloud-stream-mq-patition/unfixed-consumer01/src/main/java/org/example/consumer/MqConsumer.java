package org.example.consumer;

import org.example.config.MyKafkaSink;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @program: stream-mq-group
 * @description:
 * @author: wjl
 * @create: 2023-05-16 18:01
 **/
@Component
public class MqConsumer {

    @StreamListener(MyKafkaSink.MYKAFKA_INPUT)
    public void process2(Object message){
        System.out.println("MyConsumer01 receive message from groupA:"+message);
    }
}
