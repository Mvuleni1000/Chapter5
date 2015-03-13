package za.ac.cput.chap5.structural_Patterns.compositePattern;

import java.awt.*;
import java.util.ArrayList;

import java.util.List;

/**
 * Created by student on 2015/03/13.
 */
public class HumanDatabase  implements HumanInterface{


    List<HumanInterface> components = new ArrayList<HumanInterface>();

    @Override
    public void getGender()
    {
        for(HumanInterface comp : components){
            comp.getGender();
        }
    }

    @Override
    public void getID()
    {
        for(HumanInterface comp : components)
        {
            comp.getID();
        }
    }

    public void addHuman(HumanInterface comp)
    {
        components.add(comp);
    }

    public void removeHuman(HumanInterface comp)
    {
        components.remove(comp);
    }

    public List<HumanInterface>getDetails(){
        return components;
    }


}
