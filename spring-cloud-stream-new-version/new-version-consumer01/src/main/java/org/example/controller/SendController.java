package org.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud-stream-new-version
 * @description:
 * @author: wjl
 * @create: 2023-06-14 20:52
 **/
@RestController
public class SendController {
    @Autowired
    private StreamBridge streamBridge;


    @RequestMapping("patition")
    public String patition(String msg){
        System.out.println("===========patition=========");
        streamBridge.send("rabbitselfsender",msg);
        return "sucess";
    }
    @RequestMapping("consumer_group")
    public String consumerGroup(String msg){
        System.out.println("===========kafkaselfsender=========");
        streamBridge.send("kafkaselfsender",msg);
        return "sucess";
    }



}
