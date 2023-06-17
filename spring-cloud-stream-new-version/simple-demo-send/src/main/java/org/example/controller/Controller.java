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


    @RequestMapping("send_msg01")
    public String sendMsg01(String msg){
        streamBridge.send("handlesend",msg);
        return "sucess";
    }

    @RequestMapping("send_msg02")
    public String sendMsg02(String msg){
        streamBridge.send("handlesend1",msg);
        streamBridge.send("handlesend2",msg);
        return "sucess";
    }




    @RequestMapping("send_msg")
    public String sendMsg(String msg){
        System.out.println("===========HandleFlowStep_01=========");
        streamBridge.send("handleflowstep01",msg);
        return "sucess";
    }


    @RequestMapping("sendGather_right1")
    public String sendGatherRight1(String msg1,String msg2){
        streamBridge.send("gather1",msg1);
        streamBridge.send("gather2",msg2);
        return "sucess";
    }

    @RequestMapping("sendGather_wrong1")
    public String sendGatherWrong1(String msg1,String msg2){
        for (int i = 0; i < 10; i++) {
            streamBridge.send("gather1",msg1+i);
        }
        for (int i = 0; i < 10; i++) {
            streamBridge.send("gather2",msg2+i);
        }

        return "sucess";
    }

    @RequestMapping("sendGather_wrong2")
    public String sendGatherWrong2(String msg1,String msg2){
        streamBridge.send("gather2",msg2);
        return "sucess";
    }
}
