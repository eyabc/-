package expert001_01;

import main.java.expert001_01.Car;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    @Test
    public void 자동차_장착_타이어브랜드_테스트() {
        Car car = new Car();

        assertEquals("장착된 타이어: Korea Tire", car.getTireBrand());
    }
}
