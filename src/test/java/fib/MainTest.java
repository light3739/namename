package fib;

import org.junit.Assert;
import org.junit.Test;


public class MainTest {
    @Test
    public void testgetfibanachi() {
        int[] expected = {0, 1, 1, 2, 3, 5};
        int[] actual = Main.getFibonachi(6);
        Assert.assertArrayEquals(expected, actual);
    }
}
