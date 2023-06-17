package com.example.streammq;

import com.example.streammq.config.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;


@SpringBootApplication
@EnableBinding({Source.class, Sink.class,
        MyRabbitSource.class, MyRabbitSink.class,
        MyRocketSource.class,MyRocketSink.class})
public class StreamMqApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamMqApplication.class, args);
    }

}
