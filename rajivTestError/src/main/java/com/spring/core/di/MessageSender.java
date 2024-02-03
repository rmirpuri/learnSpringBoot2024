package com.spring.core.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class MessageSender {

    private MessageService messageService;
    private SMSService smsService;

    //@Autowired
    public MessageSender(@Qualifier("emailservice") MessageService messageService){
        this.messageService = messageService;
        System.out.println("Consturtor based dependency injection");
    }
    @Autowired
    public MessageSender(@Qualifier("emailservice") MessageService messageService, SMSService smsService){
        this.messageService = messageService;
        this.smsService = smsService;
        System.out.println("Consturtor based dependency injection 2");
    }

    public void sendMessage(String message){

        this.messageService.sendMessage(message);
        this.smsService.sendMessage(message);
    }
}
