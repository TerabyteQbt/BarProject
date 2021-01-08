package bar;

import org.junit.Assert;
import org.junit.Test;

import foo.Constants;

public class FooDependencyTest {

    @Test
    public void testFooDependency() throws Exception {
        // We expect foo to provide the list like this:
        Assert.assertTrue(Constants.DEVS.size() == 2);
        Assert.assertTrue(Constants.DEVS.contains("amling"));
        Assert.assertTrue(Constants.DEVS.contains("cmyers"));
    }
}


