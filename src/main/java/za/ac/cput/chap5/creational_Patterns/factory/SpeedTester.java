package za.ac.cput.chap5.creational_Patterns.factory;

/**
 * Created by student on 2015/03/11.
 */
public class SpeedTester {

    private static SpeedTester speed = null;

    private SpeedTester(){}

    public static SpeedTester getSpeed()  //this method is used as a object to call other methods
    {
        if(speed == null)
        {
            speed = new SpeedTester();
        }
        return speed;
    }

    public Vehicle getVehiclespeed(String spd)
    {
        if("Wheels".equalsIgnoreCase(spd))
        {
            return new Bus();
        }
        else
            return new Car();
    }
}
