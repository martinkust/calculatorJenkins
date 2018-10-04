package org.apache.maven.archetypes;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    public Calculator calculator = new Calculator();

    @Test
    public void addTest() {
        assertTrue(calculator.add(2d,2d) == 4 );
    }

    @Test
    public void subtractTest() {
        assertTrue(calculator.subtract(2d,2d) == 0 );
    }

    @Test
    public void multiplyTest() {
        assertTrue(calculator.multiply(2d,2d) == 4 );
    }

    @Test
    public void divideTest() {
        assertTrue(calculator.divide(2d,2d) == 1 );
    }
}
