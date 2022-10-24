package com.miniprojet.collaborateurservice.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class Collabortauerservice {

	public static void main(String[] args) {
		SpringApplication.run(Collabortauerservice.class, args);

	}

}
