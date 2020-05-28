package expert002;

import main.java.expert002.AmericaTire;
import main.java.expert002.Car;
import main.java.expert002.KoreaTire;
import main.java.expert002.Tire;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    @Test
    public void 자동차_코리아타이어_장착_타이어브랜드_테스트() {
        Tire tire1 = new KoreaTire();
        Car car1 = new Car();
        car1.setTire(tire1);

        assertEquals("장착된 타이어: Korea Tire", car1.getTireBrand());
    }

    @Test
    public void 자동차_아메리카타이어_장착_타이어브랜드_테스트() {
        Tire tire2 = new AmericaTire();
        Car car2 = new Car();
        car2.setTire(tire2);

        assertEquals("장착된 타이어: America Tire", car2.getTireBrand());
    }
}
