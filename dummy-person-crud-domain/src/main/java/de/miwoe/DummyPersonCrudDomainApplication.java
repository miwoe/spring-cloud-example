package de.miwoe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DummyPersonCrudDomainApplication {

	public static void main(String[] args) {
		SpringApplication.run(DummyPersonCrudDomainApplication.class, args);
	}
}
