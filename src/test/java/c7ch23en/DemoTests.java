package c7ch23en;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author c7ch23en
 */
public class DemoTests {

    @Test
    public void testDemo() {
        Demo demo = new Demo();
        Assert.assertEquals("ok", demo.demo());
    }

}
