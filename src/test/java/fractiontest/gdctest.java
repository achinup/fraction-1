package fractiontest;
import org.junit.Assert;
import org.junit.Test;

import static fractiontest.gcd.Gcd;
import static org.junit.Assert.assertEquals;
public class gdctest {
    @Test
    public void gdct() throws Exception {
        assertEquals(4,Gcd(4,8));
    }
    @Test
    public void gdct1() throws Exception {
        assertEquals(4,Gcd(-4,8));
    }
    @Test
    public void gdct2() throws Exception {
        assertEquals(8,Gcd(8,8));
    }
    @Test
    public void gdct3() throws Exception {
        assertEquals(8,Gcd(0,-8));
    }
}
