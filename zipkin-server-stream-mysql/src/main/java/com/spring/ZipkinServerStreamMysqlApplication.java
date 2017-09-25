package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@EnableZipkinStreamServer
@SpringBootApplication
public class ZipkinServerStreamMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServerStreamMysqlApplication.class, args);
	}

}
