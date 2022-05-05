package com.freeledgers.freeoauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FreeOauth2Application {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "oauth2-server");
		SpringApplication.run(FreeOauth2Application.class, args);
	}

}
