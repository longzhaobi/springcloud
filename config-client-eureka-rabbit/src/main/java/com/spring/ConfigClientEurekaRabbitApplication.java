package com.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientEurekaRabbitApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigClientEurekaRabbitApplication.class).web(true).run(args);
	}

}
