import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculate;


    @Before
    public void before(){
        calculate = new Calculator();
    }

    @Test
    public void addition(){
        assertEquals(3, calculate.add(2, 1));
    }

    @Test
    public void subtraction(){
        assertEquals(5, calculate.subtract(8, 3));
    }

    @Test
    public void multiplication(){
        assertEquals(25, calculate.multiply(5, 5));
    }

    @Test
    public void division(){
        assertEquals(10.09, calculate.divide(33.3, 3.3), 0.01 );
    }

}


