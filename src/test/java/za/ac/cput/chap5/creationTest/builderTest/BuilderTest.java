package za.ac.cput.chap5.creationTest.builderTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chap5.creational_Patterns.builder.*;

/**
 * Created by student on 2015/03/12.
 */
public class BuilderTest {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void TestBuilder()throws Exception
    {
        Personbuilder personbuilder = new Studentbuilder();
        PersonDirector personDirector = new PersonDirector(personbuilder);
        personDirector.buildPerson();

        Person person = personDirector.getPerson();

        Assert.assertNotEquals("Sbu","Mnisi",person.toString());



    }

    @Test
    public void TestBuilderLectur()throws Exception
    {
        Personbuilder personbuilder = new Lecturebuilder();
        PersonDirector personDirector = new PersonDirector(personbuilder);
        personDirector.buildPerson();

        Person person = personDirector.getPerson();

        Assert.assertNotEquals("Ephriam","Malebe",person.toString());



    }




    @After
    public void tearDown() throws Exception {


    }
}
