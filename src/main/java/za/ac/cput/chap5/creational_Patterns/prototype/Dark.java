package za.ac.cput.chap5.creational_Patterns.prototype;

/**
 * Created by student on 2015/03/11.
 */
public class Dark implements FlyingAnimals {

    private String flee;
    public Dark (String dar)
    {
        flee= dar;
    }

    @Override
    public FlyingAnimals flying()
    {
        return new Dark(flee);
    }

    @Override
    public String toString() {
        return "Dark" + "flee" + flee;
    }
}
