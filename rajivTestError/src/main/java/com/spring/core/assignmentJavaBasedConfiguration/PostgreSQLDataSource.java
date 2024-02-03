package com.spring.core.assignmentJavaBasedConfiguration;



public class PostgreSQLDataSource implements DataSource {
    @java.lang.Override
    public String[] getEmails() {

        String [] listOfEmails ={"email1_PostgreSQLDataSource@gmail.com", "john@gmail.com"};
        return listOfEmails;
    }
}
