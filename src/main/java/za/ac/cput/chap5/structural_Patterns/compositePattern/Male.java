package za.ac.cput.chap5.structural_Patterns.compositePattern;

/**
 * Created by student on 2015/03/13.
 */
public class Male implements HumanInterface {
    private String name;
    private String gender = "Male";
    private String Id = "12321";

    public Male(String name) {

        this.name = name;
    }

    @Override
    public void getGender()
    {
        System.out.print(name + "Mnisi");
    }

    @Override
    public void getID()
    {
       System.out.print(name + "123");
    }

    @Override
    public String toString() {
        return name ;
    }
}
