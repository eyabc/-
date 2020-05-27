package main.java.expert002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("main/java/expert002/expert002.xml");

        Car car = context.getBean("car", Car.class);
        Tire tire = context.getBean("tire", Tire.class);
        car.setTire(tire);

        System.out.println(car.getTireBrand());
    }
}
