package com.spring.core.assignmentAnnotationBasedConfiguration;

import org.springframework.stereotype.Component;

@Component("mysqldatasource")
public class MySQLDataSource implements DataSource{

    @java.lang.Override
    public String[] getEmails() {

        String [] listOfEmails ={"email1_MySQLDataSource@gmail.com"};
        return listOfEmails;
    }
}
