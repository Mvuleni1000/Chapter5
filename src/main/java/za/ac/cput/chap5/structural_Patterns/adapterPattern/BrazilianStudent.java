package za.ac.cput.chap5.structural_Patterns.adapterPattern;

/**
 * Created by student on 2015/03/12.
 */
public class BrazilianStudent extends Student implements Translator{

    @Override
    public Teacher learnPorgut()
    {
        return learnlesson();
    }

    @Override
    public Teacher learnEnglish() {
        Teacher tech =  learnlesson();
        return teachStudent(tech);
    }

    private Teacher teachStudent (Teacher teacher)
    {
        return new Teacher(teacher.getEnglishlesson());
    }


}
