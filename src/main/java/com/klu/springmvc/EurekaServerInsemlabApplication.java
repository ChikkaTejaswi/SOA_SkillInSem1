package com.klu.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerInsemlabApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerInsemlabApplication.class, args);
	}

}
