package tn.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroServiceEmployeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceEmployeApplication.class, args);
	}

}
