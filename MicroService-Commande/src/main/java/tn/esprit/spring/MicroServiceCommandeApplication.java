package tn.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MicroServiceCommandeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceCommandeApplication.class, args);
	}

}
