package com.spring.core.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class MessageSender {

    @Autowired
    @Qualifier("emailservice")
    private MessageService messageService;
    @Autowired
    //@Qualifier("smsService")
    private MessageService smsService;
/*    @Autowired
    public void setMessdageService(@Qualifier("emailservice") MessageService messageService) {
        this.messageService = messageService;
        System.out.println("Setter based dependency. ");
    }

    @Autowired
    public void setSmsService(@Qualifier("smsService") MessageService smsService) {
        this.smsService = smsService;
        System.out.println("set sms service");
    }*/
    //@Autowired
/*    public MessageSender(@Qualifier("emailservice") MessageService messageService){
        this.messageService = messageService;
        System.out.println("Consturtor based dependency injection");
    }
    @Autowired
    public MessageSender(@Qualifier("emailservice") MessageService messageService, SMSService smsService){
        this.messageService = messageService;
        this.smsService = smsService;
        System.out.println("Consturtor based dependency injection 2");
    }*/

    public void sendMessage(String message){
        this.messageService.sendMessage(message);
        this.smsService.sendMessage(message);
    }
}
