package org.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud-stream-new-version
 * @description:
 * @author: wjl
 * @create: 2023-05-19 21:49
 **/
@RestController
public class Controller {
    @Autowired
    private StreamBridge  streamBridge;
    @RequestMapping("send_msg")
    public String sendMsg(String msg){
        streamBridge.send("output",msg);
        return "sucess";
    }
}
