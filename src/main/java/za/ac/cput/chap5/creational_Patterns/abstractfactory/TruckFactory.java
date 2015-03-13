package za.ac.cput.chap5.creational_Patterns.abstractfactory;

/**
 * Created by student on 2015/03/11.
 */
public class TruckFactory implements WheelFactory {

    @Override
    public Wheels getWheels(String wheel)
    {
        if("Truck".equalsIgnoreCase(wheel))
            return new Truck();
            return null;
    }
}
