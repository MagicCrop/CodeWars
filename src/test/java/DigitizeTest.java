import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DigitizeTest {
    
    @Test
    public void tests() {
        assertArrayEquals(new int[]{1, 3, 2, 5, 3}, Digitize.digitize(35231));
    }
    
}