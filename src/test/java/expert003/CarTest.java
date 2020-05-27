package test.java.expert003;

import main.java.expert003.Car;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/java/expert003/expert003.xml" })
public class CarTest {
    @Autowired
    Car car;

    @Test
    public void 자동차_코리아타이어_장착_타이어브랜드_테스트() {
        assertEquals("장착된 타이어: Korea Tire", car.getTireBrand());
    }


}
