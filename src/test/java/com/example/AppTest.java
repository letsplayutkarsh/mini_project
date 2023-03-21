package com.example;



import org.junit.Test;

/**
 * Unit test for simple App.
 */
import static org.junit.Assert.*;

public class AppTest {
    
    @Test
    public void testSquareRootFunction() {
        double expectedResult = 4.0;
        double actualResult = Math.sqrt(16.0);
        assertEquals(expectedResult, actualResult, 0.001);
    }
    
    @Test
    public void testFactorialFunction() {
        int expectedResult = 120;
        int actualResult = 1;
        for (int i = 1; i <= 5; i++) {
            actualResult *= i;
        }
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testNaturalLogarithmFunction() {
        double expectedResult = 1.791759469228055;
        double actualResult = Math.log(6.0);
        assertEquals(expectedResult, actualResult, 0.001);
    }
    
    @Test
    public void testPowerFunction() {
        double expectedResult = 16.0;
        double actualResult = Math.pow(4.0, 2.0);
        assertEquals(expectedResult, actualResult, 0.001);
    }
}

