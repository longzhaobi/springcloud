package com.spring.hello.web;

/**
 * Created by chuan on 2017-9-20.
 */

import com.spring.hello.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Value("${name}")
    private String name;

//    @Autowired
//    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() throws InterruptedException {
//        ServiceInstance instance = client.getLocalServiceInstance();
//        int sleepTime = new Random().nextInt(3000);
//        System.out.println("sleepTime:" + sleepTime);
//        System.out.println("/hello, host:"+instance.getHost() + ", service_id:" + instance.getServiceId());
        return name;
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {
        return new User(name, age);
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello(@RequestBody User user) {
        return "Hello "+ user.getName() + ", " + user.getAge();
    }
}
