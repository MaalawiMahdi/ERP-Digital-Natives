package tn.esprit.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import tn.esprit.spring.entites.User;

@SpringBootApplication
@EnableEurekaClient
public class MicroServiceUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceUsersApplication.class, args);
	}
	
	

}
