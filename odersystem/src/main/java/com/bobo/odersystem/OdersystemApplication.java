package com.bobo.odersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class OdersystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(OdersystemApplication.class, args);
    }

    @RequestMapping("/")
    public String sayHello(){
        return "hello,world!";
    }

}
