package com.example.annotations;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SpringBootApplication
@PropertySource({
        "classpath:database/persistence-test.properties"
})
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(value = "com.example")
public @interface BaseApplication {
}
