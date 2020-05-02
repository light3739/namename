package file;

import org.junit.Assert;
import org.junit.Test;


public class MainTest {
    @Test
    public void testmain() {
        double expected = 29.28344162960579;
        double actual = Main.getG(3, 2, 3.5, 5.6);
        Assert.assertEquals(expected, actual,Math.abs(expected - actual)); ;
    }


}
