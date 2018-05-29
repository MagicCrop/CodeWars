package kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommonDenominatorsTest {
    @Test
    public void test_fractions() {
        long[][] lst;
        lst = new long[][]{{1, 2}, {1, 3}, {1, 4}};
        assertEquals("(6,12)(4,12)(3,12)", CommonDenominators.convertFrac(lst));
    }
}