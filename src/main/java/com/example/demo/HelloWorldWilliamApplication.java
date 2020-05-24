package com.example.demo;

import lombok.Data;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration

public class HelloWorldWilliamApplication {
    @RequestMapping("/")
    public String HelloWorldWilliamApplication(){

        return "william test";
    }

    @RequestMapping("/hello")
    public String Hello(){

        return "Hello world";
    }

}

