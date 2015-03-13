package za.ac.cput.chap5.structural_Patterns.proxyPattern;

/**
 * Created by student on 2015/03/13.
 */
import java.util.Date;

public abstract class AirLine {

  public String flightDeparture()
  {
      return this.getClass().getSimpleName() ;
  }
}
