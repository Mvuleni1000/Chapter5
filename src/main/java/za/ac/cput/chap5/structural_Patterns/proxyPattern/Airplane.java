package za.ac.cput.chap5.structural_Patterns.proxyPattern;

/**
 * Created by student on 2015/03/13.
 */
public class Airplane extends AirLine {

        public Airplane()
    {
        try
        {
            Thread.sleep(1002);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
