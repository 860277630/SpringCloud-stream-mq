package org.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud-stream-new-version
 * @description:
 * @author: wjl
 * @create: 2023-05-21 11:18
 **/
@RestController
public class SendController {
    @Autowired
    private StreamBridge streamBridge;

    @RequestMapping("sendGather")
    public String sendGather(String msg1,String msg2){
        streamBridge.send("gather1",msg1);
        streamBridge.send("gather2",msg2);
        return "sucess";
    }
}
