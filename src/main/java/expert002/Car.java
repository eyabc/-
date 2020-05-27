package main.java.expert002;

public class Car {
    Tire tire;

    public String getTire() {
        return tire.getBrand();
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public String getTireBrand() {
        return "장착된 타이어: " + tire.getBrand();
    }
}
