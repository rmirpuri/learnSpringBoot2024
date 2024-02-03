package com.spring.core.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class Students{
    private Address address;

    public Students(Address address) {
        this.address = address;
    }

    public void print(){
        System.out.println("Student class method called");
        address.print();
    }
}

class Address{
    public void print(){
        System.out.println("Address class method called");
    }
}
@Configuration
class AppConfig{
    @Bean(name = "addressBean")
    public Address address(){
        return new Address();
    }
    @Bean(name = {"studentBean","studentDemo"})
    public Students student(){
        return new Students(address());
    }
}

public class BeansAnnotationDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //Students students = applicationContext.getBean(Students.class);
        //Students students = (Students) applicationContext.getBean("studentBean");
        Students students = (Students) applicationContext.getBean("studentDemo");

        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for(String bean: beanNames){
            System.out.println(bean);
        }

        students.print();
    }
}
