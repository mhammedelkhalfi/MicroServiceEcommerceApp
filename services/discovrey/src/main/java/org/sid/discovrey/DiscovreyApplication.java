package org.sid.discovrey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscovreyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscovreyApplication.class, args);
	}

}
