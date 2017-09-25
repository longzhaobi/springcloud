package com.spring.sink;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @Author： 龙召碧
 * @Date: Created in 2017-9-24 10:00
 */
@EnableBinding( value = {Sink.class, SinkSender.class})
public class SinkReceiver {

    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        System.out.println("Received:" + payload);
    }
}
