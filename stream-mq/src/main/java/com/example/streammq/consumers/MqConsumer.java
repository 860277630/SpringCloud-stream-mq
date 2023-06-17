package com.example.streammq.consumers;

import com.example.streammq.config.MyRabbitSink;
import com.example.streammq.config.MyRocketSink;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

/**
 * @program: stream-mq
 * @description:
 * @author: wjl
 * @create: 2023-05-07 19:17
 **/
@Component
public class MqConsumer {

    @StreamListener(MyRocketSink.MYROCKETMQ_INPUT)
    public void process3(Object message){
        System.out.println("receive message:"+message);
    }

    @StreamListener(Sink.INPUT)
    public void process1(Object message){
        System.out.println("receive message:"+message);
    }

    @StreamListener(MyRabbitSink.MYRABBITMQ_INPUT)
    public void process2(Object message){
        System.out.println("receive message:"+message);
    }


}
