package file;

import org.junit.Assert;
import org.junit.Test;


public class MainTest {
    @Test
    public void testmainFib_While() {
        int[] expected = {0, 1, 1, 2, 3, 5};
        int[] actual = Main.getFibonachiWhile(6);
        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void testgetFib_For() {
        int[] expected = {0, 1, 1, 2, 3, 5};
        int[] actual = Main.getFibonachiFor(6);
        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void testgetFib_DoWhile() {
        int[] expected = {0, 1, 1, 2, 3, 5};
        int[] actual = Main.getFibonachido(6);
        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void testgetFac_While() {
        int expected = 120;
        int actual = Main.getFacWhile(5);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testgetFac_For() {
        int expected = 120;
        int actual = Main.getFacFor(5);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public  void testgetFac_Do(){
        int expected = 120;
        int actual = Main.getFacdo(5);
        Assert.assertEquals(expected, actual);
    }

}
