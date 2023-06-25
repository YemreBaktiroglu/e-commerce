package com.example.service.repository.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
@Configuration
@ConfigurationProperties(prefix = "database")
@EnableJpaRepositories(
        basePackages = "com.example.service.repository.*",
        entityManagerFactoryRef = "EntityManager"
)
public class DBConfiguration {

    @Value("${url}")
    private String jdbcUrl;

    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    @Value("${driver-class-name}")
    private String className;

    @Bean(name = "EntityManager")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(EntityManagerFactoryBuilder entityManagerFactoryBuilder) {
        return entityManagerFactoryBuilder
                .dataSource(getDataSource())
                .packages("com.example.model.table.*")
                .build();
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource(jdbcUrl, username, password);
        dataSource.setDriverClassName("org.postgresql.Driver");

        return DataSourceBuilder.derivedFrom(dataSource).build();
    }
}
