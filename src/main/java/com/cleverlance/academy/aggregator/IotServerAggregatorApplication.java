package com.cleverlance.academy.aggregator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//localhost:8080/actuator/health
@SpringBootApplication
public class IotServerAggregatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(IotServerAggregatorApplication.class, args);
	}

}
