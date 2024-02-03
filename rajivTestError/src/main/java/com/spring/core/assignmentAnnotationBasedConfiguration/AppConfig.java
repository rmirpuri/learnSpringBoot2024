package com.spring.core.assignmentAnnotationBasedConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.core.assignment")
public class AppConfig {
    /*@Bean
    public MySQLDataSource mySQLDataSource(){
        return new MySQLDataSource();
    }
    @Bean
    public PostgreSQLDataSource postgreSQLDataSource(){
        return new PostgreSQLDataSource();

    }*/

}
