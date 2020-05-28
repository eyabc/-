package expert001_02;

import main.java.expert001_02.AmericaTire;
import main.java.expert001_02.Car;
import main.java.expert001_02.KoreaTire;
import main.java.expert001_02.Tire;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CarTest {
    @Test
    public void 자동차_장착_코리아타이어_테스트() {
        Tire tire = new KoreaTire();
        Car car = new Car(tire);

        assertEquals("장착된 타이어: Korea Tire", car.getTireBrand());
    }

    @Test
    public void 자동차_장착_아메리카타이어_테스트() {
        Tire tire = new AmericaTire();
        Car car = new Car(tire);

        assertEquals("장착된 타이어: America Tire", car.getTireBrand());
    }
}
