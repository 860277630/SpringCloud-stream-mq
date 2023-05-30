package org.example.consumer;

import org.example.config.MyConsumer01;
import org.example.config.MyConsumer03;
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

    @StreamListener(MyConsumer01.MY_CONSUMER01)
    public void process1(Object message){
        System.out.println("MyConsumer01 receive message from groupA:"+message);
    }


    @StreamListener(MyConsumer03.MY_CONSUMER03)
    public void process2(Object message){
        System.out.println("MyConsumer03 receive message1 from groupB:"+message);
    }
}
