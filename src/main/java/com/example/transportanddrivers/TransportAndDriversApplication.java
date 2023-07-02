package com.example.transportanddrivers;

import com.example.transportanddrivers.models.Driver;
import com.example.transportanddrivers.models.Transport;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class TransportAndDriversApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);


        Transport car = context.getBean("car", Transport.class);
        Transport bus = context.getBean("bus", Transport.class);
        Transport pickup = context.getBean("pickup", Transport.class);

        car.gas();
        bus.gas();
        pickup.gas();

        Driver busDriver = context.getBean("busdriver", Driver.class);
        Driver carDriver = context.getBean("carpdriver", Driver.class);
        Driver pickupDriver = context.getBean("pickupdriver", Driver.class);
        busDriver.drive();
        carDriver.drive();
        pickupDriver.drive();


    }

}
