package za.ac.cput.chap5.structural_Patterns.adapterPattern;

/**
 * Created by student on 2015/03/12.
 */
public class Student {

    public Teacher learnlesson()
    {
    return  new Teacher("english")   ;
    }
}
