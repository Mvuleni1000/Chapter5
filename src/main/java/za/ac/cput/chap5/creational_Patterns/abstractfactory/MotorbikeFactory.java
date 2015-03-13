package za.ac.cput.chap5.creational_Patterns.abstractfactory;

/**
 * Created by student on 2015/03/11.
 */
public class MotorbikeFactory implements WheelFactory {

    @Override
    public Wheels getWheels(String tyre ) {
        if ("MotorBike".equalsIgnoreCase(tyre))
            return new Motorbike();
        else
            return null;
    }
}
