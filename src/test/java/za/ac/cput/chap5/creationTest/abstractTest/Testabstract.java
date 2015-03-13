package za.ac.cput.chap5.creationTest.abstractTest;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chap5.creational_Patterns.abstractfactory.Motorbike;
import za.ac.cput.chap5.creational_Patterns.abstractfactory.Truck;
import za.ac.cput.chap5.creational_Patterns.abstractfactory.Wheels;

/**
 * Created by student on 2015/03/12.
 */
public class Testabstract {

    @Before
    public void setUp() throws Exception {}


    @Test
    public void testMotorbike() throws Exception {

        Wheels motorbike = new Motorbike();

        Assert.assertEquals("2",motorbike.getWheels());
    }

    public void testTruck()
    {
        Wheels truck = new Truck();
        Assert.assertSame("10", truck.getWheels());
    }

    @After
    public void tearDown() throws Exception {


    }
}
