package com.spring.core.assignmentJavaBasedConfiguration;

import org.springframework.stereotype.Component;

public class EmailService {

    //@Autowired
    public DataSource dataSource;

    public EmailService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void sendEmail(){
        String[] listOfEmails =dataSource.getEmails();

        for (String fruit : listOfEmails) {
            System.out.println(fruit);
        }

        //System.out.println(dataSource.getEmails());
    }

}
