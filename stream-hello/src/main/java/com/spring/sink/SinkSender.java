package com.spring.sink;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

/**
 * @Author： 龙召碧
 * @Date: Created in 2017-9-24 10:55
 */
@Component
public interface SinkSender {
    @Output(Source.OUTPUT)
    MessageChannel output();
}
