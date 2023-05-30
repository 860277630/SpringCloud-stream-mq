package com.example.streammq.controller;

import com.example.streammq.config.MyRabbitSource;
import com.example.streammq.config.MyRocketSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.stream.messaging.Source;


/**
 * @program: stream-mq
 * @description:
 * @author: wjl
 * @create: 2023-05-07 18:05
 **/
@RestController
public class MqController {

    @Autowired
    private Source source;

    @Autowired
    private MyRabbitSource myRabbitSource;

    @Autowired
    private MyRocketSource myRocketSource;

    @RequestMapping("kafka_send")
    public Object kafkaSend(String message){
        MessageBuilder<String> messageBuilder = MessageBuilder.withPayload(message);
        source.output().send(messageBuilder.build());
        return "message sended:"+message;
    }

    @RequestMapping("rabbit_send")
    public Object rabbitSend(String message){
        MessageBuilder<String> messageBuilder = MessageBuilder.withPayload(message);
        myRabbitSource.myrabbitmqoutput().send(messageBuilder.build());
        return "message sended:"+message;
    }

    @RequestMapping("rocket_send")
    public Object rocketSend(String message){
        MessageBuilder<String> messageBuilder = MessageBuilder.withPayload(message);
        myRocketSource.myrocketmqoutput().send(messageBuilder.build());
        return "message sended:"+message;
    }



}
