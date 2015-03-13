package za.ac.cput.chap5.creational_Patterns.builder;

/**
 * Created by student on 2015/03/12.
 */
public class Studentbuilder implements Personbuilder{


    private Person person;

    public Studentbuilder (){
        person = new Person();
    }

    @Override
    public void buildName()
    {
        person.setName("Ephraim");
    }

    @Override
    public void buildSurname()
    {
        person.setSurname("Malebe");
    }
    @Override
    public Person getPerson()
    {
        return person;
    }

}
