// package Test;
import static org.junit.Assert.*;
import org.example.Calculator;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSqrt1(){
        assertEquals(2, Calculator.calculate(1, 4), 0.001);
    }
    @Test
    public void testSqrt2(){
        assertEquals(-1, Calculator.calculate(1, -4), 0.001);
    }
    @Test
    public void testSqrt3(){
        assertEquals(5, Calculator.calculate(1, 25), 0.001);
    }

    @Test
    public void testFact1(){
        assertEquals(120, (int) Calculator.calculate(2, 5));
    }

    @Test
    public void testFact2(){
        assertEquals(1, (int) Calculator.calculate(2, 0));
    }

    @Test
    public void testFact3(){
        assertEquals(-1,(int)Calculator.calculate(2, -5));
    }

    @Test
    public void testLog1(){
        assertEquals(1.6094379124341003, Calculator.calculate(3, 5), 0.001);
    }

    @Test
    public void testLog2(){
        assertEquals(1.7047480922384253, Calculator.calculate(3, 5.5F), 0.001);
    }

    @Test
    public void testLog3(){
        assertEquals(-1, Calculator.calculate(3, -5), 0.001);
    }

    @Test
    public void testPow1(){
        assertEquals(4, Calculator.calculate(4, 2, 2), 0.001);
    }

    @Test
    public void testPow2(){
        assertEquals(16, Calculator.calculate(4, 2, 4), 0.001);
    }

    @Test
    public void testPow3(){
        assertEquals(-8, Calculator.calculate(4, -2, 3), 0.001);
    }

    @Test
    public void testPow4(){
        assertEquals(2, Calculator.calculate(4, 4, 0.5F), 0.001);
    }

    @Test
    public void testPow5(){
        assertEquals(-1, Calculator.calculate(4, -4, 0.5F), 0.001);
    }
}  