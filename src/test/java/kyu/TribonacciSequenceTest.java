package kyu;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TribonacciSequenceTest {
    private TribonacciSequence variabonacci;
    
    @Before
    public void setUp() {
        variabonacci = new TribonacciSequence();
    }
    
    @After
    public void tearDown() {
        variabonacci = null;
    }
    
    @Test
    public void basicTests() {
        double precision = 1e-10;
        assertArrayEquals(new double[]{1, 1, 1, 3, 5, 9, 17, 31, 57, 105}, variabonacci.tribonacci(new double[]{1, 1, 1}, 10), precision);
        assertArrayEquals(new double[]{0, 0, 1, 1, 2, 4, 7, 13, 24, 44}, variabonacci.tribonacci(new double[]{0, 0, 1}, 10), precision);
        assertArrayEquals(new double[]{0, 1, 1, 2, 4, 7, 13, 24, 44, 81}, variabonacci.tribonacci(new double[]{0, 1, 1}, 10), precision);
    }
}