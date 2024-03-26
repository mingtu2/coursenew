package com.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurakeApplication {

	public static void main(String[] args) {
		System.out.println("111");
		SpringApplication.run(EurakeApplication.class, args);
	}

}
