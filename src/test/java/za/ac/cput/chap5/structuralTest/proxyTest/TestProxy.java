package za.ac.cput.chap5.structuralTest.proxyTest;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chap5.structural_Patterns.proxyPattern.Location;

/**
 * Created by student on 2015/03/13.
 */
public class TestProxy {
    @Before
    public void setUp() throws Exception {

    }


    @Test
    public  void TestProxy()
    {
        Location loc =  new Location();
       loc.loadFlight();
    }

    @After
    public void tearDown() throws Exception {}
}
