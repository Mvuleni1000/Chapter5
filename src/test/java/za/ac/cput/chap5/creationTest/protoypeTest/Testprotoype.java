package za.ac.cput.chap5.creationTest.protoypeTest;

import com.sun.xml.internal.ws.policy.AssertionSet;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chap5.creational_Patterns.prototype.Bird;
import za.ac.cput.chap5.creational_Patterns.prototype.Dark;
import za.ac.cput.chap5.creational_Patterns.prototype.FlyingAnimals;

/**
 * Created by student on 2015/03/12.
 */
public class Testprotoype {


    @Before
    public void setUp() throws Exception {}


    @Test
    public void testBird() throws Exception {
        FlyingAnimals bird = new Bird("fly");

        Assert.assertEquals("Birdanimalfly",bird.toString());
    }

    @Test
    public void testDark() throws Exception {
        FlyingAnimals bird = new Dark("fly");

        Assert.assertEquals("Darkfleefly",bird.toString());
    }

    @After
    public void tearDown() throws Exception {}
}
