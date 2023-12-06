package com.depot.depot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DepotApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepotApplication.class, args);
    }

}
