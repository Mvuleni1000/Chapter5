package za.ac.cput.chap5.creational_Patterns.prototype;

/**
 * Created by student on 2015/03/11.
 */
public class Bird implements FlyingAnimals{

private String animal;
    public Bird (String fly)
    {
        animal = fly;
    }

    @Override
    public FlyingAnimals flying(){
        return new Bird(animal);
    }

    @Override
    public String toString() {
        return "Bird" + "animal" + animal;
    }
}
