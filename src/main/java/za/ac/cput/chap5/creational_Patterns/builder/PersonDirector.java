package za.ac.cput.chap5.creational_Patterns.builder;

/**
 * Created by student on 2015/03/12.
 */
public class PersonDirector {

    private Personbuilder personbuilder = null;

    public PersonDirector (Personbuilder person){

        personbuilder =  person;
    }
    public void buildPerson()
    {
        personbuilder.buildName();
        personbuilder.buildSurname();
        personbuilder.getPerson();
    }

    public Person getPerson(){
        return personbuilder.getPerson();
    }

}
