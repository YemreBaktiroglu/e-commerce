package com.example.ecommerce;

import com.example.annotations.BaseApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@BaseApplication
public class EcommerceApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }

}
