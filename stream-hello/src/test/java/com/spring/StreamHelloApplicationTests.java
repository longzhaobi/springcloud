package com.spring;

import com.spring.sink.SinkSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @Author： 龙召碧
 * @Date: Created in 2017-9-24 10:53
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = StreamHelloApplicationTests.class)
@WebAppConfiguration
@Component
public class StreamHelloApplicationTests {

    @Autowired
    private MessageChannel messageChannel;

    @Test
    public void contextLoads() {
        messageChannel.send(MessageBuilder.withPayload("From SinkSender").build());
    }
}
