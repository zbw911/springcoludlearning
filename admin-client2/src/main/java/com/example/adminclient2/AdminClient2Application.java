package com.example.adminclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AdminClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(AdminClient2Application.class, args);
    }

}

