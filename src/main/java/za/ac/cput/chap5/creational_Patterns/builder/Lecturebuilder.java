package za.ac.cput.chap5.creational_Patterns.builder;

/**
 * Created by student on 2015/03/12.
 */
public class Lecturebuilder implements Personbuilder {

    private Person person;

    public Lecturebuilder (){
        person = new Person();
    }

    @Override
    public void buildName()
    {
        person.setName("Sbu");
    }

    @Override
    public void buildSurname()
    {
        person.setSurname("Mnisi");
    }
    @Override
    public Person getPerson()
    {
        return person;
    }

}
