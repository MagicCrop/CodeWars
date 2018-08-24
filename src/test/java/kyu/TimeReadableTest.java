package kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeReadableTest {
    @Test
    public void Tests() {
        assertEquals("makeReadable(0)", "00:00:00", TimeReadable.makeReadable(0));
        assertEquals("makeReadable(5)", "00:00:05", TimeReadable.makeReadable(5));
        assertEquals("makeReadable(60)", "00:01:00", TimeReadable.makeReadable(60));
        assertEquals("makeReadable(86399)", "23:59:59", TimeReadable.makeReadable(86399));
        assertEquals("makeReadable(359999)", "99:59:59", TimeReadable.makeReadable(359999));
    }

}
