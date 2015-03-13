package za.ac.cput.chap5.structural_Patterns.adapterPattern;

/**
 * Created by student on 2015/03/12.
 */
public class AmericanStudent extends Student implements Translator {

    private Student student = new Student();
    @Override
    public Teacher learnPorgut()
    {
        return student.learnlesson();
    }

    @Override
    public Teacher learnEnglish() {
        Teacher tech = student.learnlesson();
        return  leacting("english");
    }

    private Teacher teachStudent (Teacher teacher)
    {
        return new Teacher(teacher.getEnglishlesson());
    }

    public Teacher leacting(String sub)
    {
        return new Teacher("english");
    }
}
