package main.java.expert001_01;

public class Car {
    Tire tire;

    public Car() {
        tire = new KoreaTire();
    }

    public String getTireBrand() {
        return "장착된 타이어: " + tire.getBrand();
    }
}
