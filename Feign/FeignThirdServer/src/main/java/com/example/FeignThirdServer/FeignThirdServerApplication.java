package com.example.FeignThirdServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FeignThirdServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignThirdServerApplication.class, args);
	}

}
