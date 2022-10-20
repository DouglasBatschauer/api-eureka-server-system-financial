package org.apieurekaserverfinancial.apieurekaserverfinancial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApiEurekaServerFinancialApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiEurekaServerFinancialApplication.class, args);
	}

}
