package com.example.FeignSecondServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FeignSecondServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignSecondServerApplication.class, args);
	}

}
