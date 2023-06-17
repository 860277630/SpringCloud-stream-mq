package org.example.producter;

import org.example.Entity.SelfMessage;
import org.example.config.MyKafkaSource01;
import org.example.config.MyKafkaSource02;
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

    @Autowired
    private MyKafkaSource01 myKafkaSource01;

    @Autowired
    private MyKafkaSource02 myKafkaSource02;

    @RequestMapping("send_msg_partition_number")
    public Object sendMsgPartitionNumber(String message) {
        for (int i = 100; i > 0; i--) {
            MessageBuilder<String> messageBuilder = MessageBuilder.withPayload(message);
            source.output().send(messageBuilder.build());
        }
        return "message sended:" + message;
    }

    @RequestMapping("send_msg_partition_payload")
    public Object sendMsgPartitionPayload(String message) {
        for (int i = 100; i > 0; i--) {
            // 单数发送 String 类型 双数发送 Message类型
            if ((i % 2) == 1) {
                MessageBuilder<String> messageBuilder = MessageBuilder.withPayload(message);
                myKafkaSource01.mykafkaOutput().send(messageBuilder.build());
            } else {
                MessageBuilder<SelfMessage> messageBuilder = MessageBuilder.withPayload(new SelfMessage(message));
                myKafkaSource01.mykafkaOutput().send(messageBuilder.build());
            }
        }
        return "message sended:" + message;
    }

    @RequestMapping("send_msg_partition_headers")
    public Object sendMsgPartitionHeaders(String message) {
        // 单数发送 headers 为 key1的 双数发送为key2的
        for (int i = 100; i > 0; i--) {
            if ((i % 2) == 1) {
                MessageBuilder<String> messageBuilder =
                        MessageBuilder.withPayload(message + "====key1:").setHeader("selfKey", "key1");
                myKafkaSource02.mykafkaOutput().send(messageBuilder.build());
            } else {
                MessageBuilder<String> messageBuilder =
                        MessageBuilder.withPayload(message + "====key2:").setHeader("selfKey", "key2");
                myKafkaSource02.mykafkaOutput().send(messageBuilder.build());
            }
        }
        return "message sended:" + message;
    }

}
