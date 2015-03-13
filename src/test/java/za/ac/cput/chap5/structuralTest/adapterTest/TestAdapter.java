package za.ac.cput.chap5.structuralTest.adapterTest;

import org.junit.After;
import org.junit.Before;
import za.ac.cput.chap5.structural_Patterns.adapterPattern.*;

/**
 * Created by student on 2015/03/13.
 */
public class TestAdapter {

    @Before
    public void setUp() throws Exception {}

    public void testBrazilianStudent()
    {
        Translator translator = new AmericanStudent();
        //teachStudent(translator);


    }

    @After
    public void tearDown() throws Exception {}
}
