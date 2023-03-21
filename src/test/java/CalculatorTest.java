// package Test;
import static org.junit.Assert.*;
import org.example.Calculator;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testFindMax(){
        assertEquals(2.0,Calculator.calculate(1, 4), 0.001);
        assertEquals(120,(int)Calculator.calculate(2, 5));
    }
}  