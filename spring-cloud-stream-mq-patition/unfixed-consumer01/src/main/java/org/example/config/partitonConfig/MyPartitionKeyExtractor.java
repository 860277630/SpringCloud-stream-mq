package org.example.config.partitonConfig;

import org.springframework.cloud.stream.binder.PartitionKeyExtractorStrategy;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @program: stream-mq
 * @description:  根据message 产生分区的key
 * @author: wjl
 * @create: 2023-05-09 02:02
 **/
@Component
public class MyPartitionKeyExtractor implements PartitionKeyExtractorStrategy {
    //自定义的规则为  从 message中的 header中拿到 对应地值进行返回
    public static final String PARTITION_PROP  = "partiton";
    @Override
    public Object extractKey(Message<?> message) {
        return message.getHeaders().get(PARTITION_PROP);
    }
}
