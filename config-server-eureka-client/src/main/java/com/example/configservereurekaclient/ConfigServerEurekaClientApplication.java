package com.example.configservereurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerEurekaClientApplication.class, args);
    }

}

