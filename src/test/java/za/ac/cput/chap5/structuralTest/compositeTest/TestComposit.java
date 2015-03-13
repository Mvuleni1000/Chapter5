package za.ac.cput.chap5.structuralTest.compositeTest;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chap5.structural_Patterns.compositePattern.HumanDatabase;
import za.ac.cput.chap5.structural_Patterns.compositePattern.HumanInterface;
import za.ac.cput.chap5.structural_Patterns.compositePattern.Male;

/**
 * Created by student on 2015/03/13.
 */
public class TestComposit {

    @Before
    public void setUp() throws Exception {}

    @Test
    public void setHuman()
    {

        HumanInterface comp = new Male("Sbu");
        Assert.assertEquals(comp.toString(), "Sbu");

    }

    @After
    public void tearDown() throws Exception {}
}
