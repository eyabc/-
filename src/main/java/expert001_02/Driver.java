package main.java.expert001_02;

public class Driver {
    public static void main(String[] args) {
        Tire tire = new KoreaTire();
        Car car = new Car(tire);

        System.out.println(car.getTireBrand());
    }
}
