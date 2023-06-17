package org.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: spring-cloud-stream-mq-patition
 * @description:
 * @author: wjl
 * @create: 2023-06-08 17:54
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SelfMessage {
    private String msg;
}
