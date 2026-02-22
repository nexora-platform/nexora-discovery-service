package com.nexora.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NexoraDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NexoraDiscoveryServiceApplication.class, args);
	}

}
