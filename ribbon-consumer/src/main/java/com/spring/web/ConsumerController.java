package com.spring.web;

import com.spring.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chuan on 2017-9-21.
 */
@RestController
public class ConsumerController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value="/ribbon-consumer", method= RequestMethod.GET)
    public String helloConsumer() {
        return helloService.hello();
    }
}
