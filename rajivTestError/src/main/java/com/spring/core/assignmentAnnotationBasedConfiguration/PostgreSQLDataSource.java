package com.spring.core.assignmentAnnotationBasedConfiguration;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("postgresqldatasource")
@Primary
public class PostgreSQLDataSource implements DataSource{
    @java.lang.Override
    public String[] getEmails() {

        String [] listOfEmails ={"email1_PostgreSQLDataSource@gmail.com", "john@gmail.com"};
        return listOfEmails;
    }
}
