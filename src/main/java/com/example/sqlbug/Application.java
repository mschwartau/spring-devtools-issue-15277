package com.example.sqlbug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// To fix the issue, exclude DevToolsDataSourceAutoConfiguration
// @SpringBootApplication(exclude = DevToolsDataSourceAutoConfiguration.class)
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
    }
}
