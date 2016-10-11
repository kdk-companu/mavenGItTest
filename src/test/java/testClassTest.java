import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by KDK on 11.10.2016.
 */
public class testClassTest extends TestCase {

    @Test
    public void testDivProject() throws Exception {
        testClass show = new testClass();
        Assert.assertEquals(5,show.divProject(25,5));

    }
}