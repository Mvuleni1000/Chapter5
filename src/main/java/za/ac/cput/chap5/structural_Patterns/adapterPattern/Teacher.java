package za.ac.cput.chap5.structural_Patterns.adapterPattern;

/**
 * Created by student on 2015/03/12.
 */
public class Teacher  {
private String englishlesson;

    public Teacher(String englishlesson) {
        this.englishlesson = englishlesson;
    }

    public void setEnglishlesson(String englishlesson) {
        this.englishlesson = englishlesson;
    }

    public String getEnglishlesson() {
        return englishlesson;
    }
}
