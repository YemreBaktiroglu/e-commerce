package com.example.service.repository.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;

@Component
@PropertySource({
        "classpath:database/persistence-test.properties"
})
@ConfigurationProperties
public class DBConfiguration {

    @Value("url")
    private String jdbcUrl;

    @Value("username")
    private String username;

    @Value("password")
    private String password;

    @Value("driver-class-name")
    private String className;

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource(jdbcUrl, username, password);
        dataSource.setDriverClassName("org.postgresql.Driver");

        return DataSourceBuilder.derivedFrom(dataSource).build();
    }
}
