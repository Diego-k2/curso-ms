package com.diegok2.hrworkers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //MARCA COMO CLIENTE DO EUREKA
@SpringBootApplication
public class HrWorkersApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrWorkersApplication.class, args);
	}

}
