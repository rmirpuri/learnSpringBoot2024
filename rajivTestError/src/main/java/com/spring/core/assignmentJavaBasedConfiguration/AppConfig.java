package com.spring.core.assignmentJavaBasedConfiguration;

import com.spring.core.assignmentAnnotationBasedConfiguration.DataSource;
import com.spring.core.assignmentAnnotationBasedConfiguration.EmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.core.assignment")
public class AppConfig {
    @Bean
    public DataSource mySQLDataSource(){
        return (DataSource) new MySQLDataSource();
    }
    @Bean
    public DataSource postgreSQLDataSource(){
        return (DataSource) new PostgreSQLDataSource();

    }
    @Bean
    public EmailService emailService(){
        return new EmailService(postgreSQLDataSource());
    }

}
