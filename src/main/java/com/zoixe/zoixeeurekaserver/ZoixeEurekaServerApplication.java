package com.zoixe.zoixeeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ZoixeEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZoixeEurekaServerApplication.class, args);
	}

}
