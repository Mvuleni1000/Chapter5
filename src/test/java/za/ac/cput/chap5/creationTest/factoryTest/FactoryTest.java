package za.ac.cput.chap5.creationTest.factoryTest;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chap5.creational_Patterns.abstractfactory.Truck;
import za.ac.cput.chap5.creational_Patterns.factory.Bus;
import za.ac.cput.chap5.creational_Patterns.factory.Car;
import za.ac.cput.chap5.creational_Patterns.factory.SpeedTester;
import za.ac.cput.chap5.creational_Patterns.factory.Vehicle;

/**
 * Created by student on 2015/03/11.
 */
public class FactoryTest {

    private SpeedTester obj;
    @Before
    public void setUp() throws Exception {}

    @Test
    public void testFactory() throws Exception
    {
        Vehicle car = new Car();
        Assert.assertEquals("4",car.numberWheels());
    }

    @Test
    public void testTruck()
    {
        Vehicle truck = new Bus();
        Assert.assertEquals("10",truck.numberWheels());

    }

    @After
    public void tearDown() throws Exception {


    }
}
