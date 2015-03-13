package za.ac.cput.chap5.creational_Patterns.singleton;

/**
 * Created by student on 2015/03/10.
 */
public class CarRental {

    private static CarRental carRental = null;

    private CarRental(){}

    public static CarRental getCarRental()
    {
        if(carRental == null)
        {
         carRental =  new CarRental();
        }

        return carRental;
    }

    public String  customerName()
    {
        return "Sbu";
    }


}
