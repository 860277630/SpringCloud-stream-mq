package org.example.config.partitonConfig;

import org.springframework.cloud.stream.binder.PartitionSelectorStrategy;
import org.springframework.stereotype.Component;

/**
 * @program: stream-mq
 * @description:
 * @author: wjl
 * @create: 2023-05-09 02:07
 **/
@Component
public class MySelector implements PartitionSelectorStrategy {
    /**
     *
     * @param key  MyPartitionKeyExtractor  返回值
     * @param partitionCount   一共有多少个分区
     * @return
     */
    @Override
    public int selectPartition(Object key, int partitionCount) {
        return Integer.parseInt(key.toString())%partitionCount;
    }
}
