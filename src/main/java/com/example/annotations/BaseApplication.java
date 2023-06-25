package com.example.annotations;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.example")
@EnableAutoConfiguration
@ComponentScan(value = "com.example")
public @interface BaseApplication {
}
