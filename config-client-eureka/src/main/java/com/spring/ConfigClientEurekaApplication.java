package com.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author： 龙召碧
 * @Date: Created in 2017-9-23 23:03
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientEurekaApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigClientEurekaApplication.class).web(true).run(args);
    }
}
