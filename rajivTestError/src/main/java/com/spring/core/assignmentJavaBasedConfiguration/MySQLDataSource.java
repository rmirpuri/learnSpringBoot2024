package com.spring.core.assignmentJavaBasedConfiguration;




public class MySQLDataSource implements DataSource {

    @java.lang.Override
    public String[] getEmails() {

        String [] listOfEmails ={"email1_MySQLDataSource@gmail.com"};
        return listOfEmails;
    }
}
