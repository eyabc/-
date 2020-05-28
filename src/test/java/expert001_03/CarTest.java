package expert001_03;

import main.java.expert001_03.AmericaTire;
import main.java.expert001_03.Car;
import main.java.expert001_03.KoreaTire;
import main.java.expert001_03.Tire;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void 자동차_장착_코리아타이어_테스트() {
        Tire tire = new KoreaTire();
        Car car = new Car();
        car.setTire(tire);

        assertEquals("장착된 타이어: Korea Tire", car.getTireBrand());
    }

    @Test
    public void 자동차_장착_아메리카타이어_테스트() {
        Tire tire = new AmericaTire();
        Car car = new Car();
        car.setTire(tire);

        assertEquals("장착된 타이어: America Tire", car.getTireBrand());
    }
}
