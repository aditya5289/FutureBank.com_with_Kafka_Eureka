package com.futurebank.accountService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountServiceApplication {

    private static final Logger logger = LoggerFactory.getLogger(AccountServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
        logger.info("Account Service Application has started successfully.");
    }
}
