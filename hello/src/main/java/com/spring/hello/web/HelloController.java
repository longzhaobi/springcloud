package com.spring.hello.web;

/**
 * Created by chuan on 2017-9-20.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HelloController {

    @Value("${name}")
    private String name;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() throws InterruptedException {
        ServiceInstance instance = client.getLocalServiceInstance();
        int sleepTime = new Random().nextInt(3000);
        System.out.println("sleepTime:" + sleepTime);
        Thread.sleep(sleepTime);
        System.out.println("/hello, host:"+instance.getHost() + ", service_id:" + instance.getServiceId());
        return name;
    }
}
