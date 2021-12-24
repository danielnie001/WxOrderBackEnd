package com.bobo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = "com.bobo")
@EntityScan("com.bobo")
@EnableAsync
@EnableScheduling
public class OdersystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(OdersystemApplication.class, args);
    }
}
