package za.ac.cput.chap5.structural_Patterns.proxyPattern;

import java.util.Date;

/**
 * Created by student on 2015/03/13.
 */
public class Location {

    Airplane airplane;

    public Location(){
        System.out.print("Creating data"+ new Date());
    }

    public void loadFlight()
    {
        if(airplane == null)
        {
            airplane = new Airplane();
        }

        //airplane.loadFlight();
    }

}
