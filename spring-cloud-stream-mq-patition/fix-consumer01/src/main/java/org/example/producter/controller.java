package org.example.producter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: stream-mq-group
 * @description:
 * @author: wjl
 * @create: 2023-05-16 17:17
 **/
@RestController
public class controller {

    @Autowired
    private Source source;


    @RequestMapping("send_msg")
    public Object sendGroupA(String message){
        for (int i = 100; i > 0; i--) {
            MessageBuilder<String> messageBuilder = MessageBuilder.withPayload(message);
            source.output().send(messageBuilder.build());
        }
        return "message sended:"+message;
    }

}