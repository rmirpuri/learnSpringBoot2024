package java.com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        /*Traveler traveler = new Traveler(new Car());
        Traveler traveler1 = new Traveler(new Bike());
        traveler.startJourney();
        traveler1.startJourney();*/

        //creating spring ioc container
        //read the configuration class
        //create and manage the spring beans
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //Retrieve Spring beans from Spring IOC container
        Car car = applicationContext.getBean(Car.class);
        car.move();

        Bike bike = applicationContext.getBean(Bike.class);
        bike.move();

        Traveler traveler3 =applicationContext.getBean(Traveler.class);
        traveler3.startJourney();


    }
}
