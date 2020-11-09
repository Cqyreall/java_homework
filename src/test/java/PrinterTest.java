import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer operation;

    @Before
    public void before(){
        operation = new Printer(55, 22);
    }

    @Test
    public void hasSheets(){
        assertEquals(55, operation.getNumberOfSheets());
    }

    @Test
    public void hasTonerVolume(){
        assertEquals(22, operation.getTonerVolume());
    }

    @Test
    public void prints(){
        assertEquals(true, operation.print(6, 5));
    }

    @Test
    public void doesnotPrint(){
        Printer newOperation = new Printer(12, 6);
        assertEquals(false, newOperation.print(5, 12));
    }

    @Test
    public void tonerReduces(){
        operation.print(12, 4);
        assertEquals(10, operation.getTonerVolume());
    }
}
