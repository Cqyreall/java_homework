import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle water;

    @Before
    public void before(){
        water =  new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, water.getVolume());
    }

    @Test
    public void waterReduces(){
        water.drink();
        water.drink();
        water.drink();
        assertEquals(70, water.getVolume());
    }

    @Test
    public void waterEmpties(){
        water.drink();
        water.empty();
        assertEquals(0, water.getVolume());
    }

    @Test
    public void waterFillsBackUp(){
        water.drink();
        water.drink();
        water.empty();
        water.fill();
        assertEquals(100, water.getVolume());
    }
}
