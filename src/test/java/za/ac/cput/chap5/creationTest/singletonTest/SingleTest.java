package za.ac.cput.chap5.creationTest.singletonTest;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chap5.creational_Patterns.singleton.CarRental;

/**
 * Created by student on 2015/03/11.
 */
public class SingleTest {

    @Before
    public void setUp() throws Exception {


    }
    @Test
    public  void testSingleton()
    {
        CarRental car = CarRental.getCarRental();
        Assert.assertEquals("Sbu",car.customerName());
    }

    @After
    public void tearDown() throws Exception {


    }
}
