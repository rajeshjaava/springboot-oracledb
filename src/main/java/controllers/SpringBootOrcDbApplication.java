package controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringBootOrcDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOrcDbApplication.class, args);
	}
}
