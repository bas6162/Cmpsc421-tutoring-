package psu.edu.tutoring;

import java.util.HashMap;

public class Tutor {

    String tutorName;

    //Constructor
    public Tutor(String tutorName) {
        this.tutorName = tutorName;
    }


    //Hashmap to add tutors to classes
    HashMap<String, Class> tutoringClasses;
    void tutoringClass(Class newClasses)
    {
        tutoringClasses.put(newClasses.className, newClasses);
    }


    public HashMap<String, Class> getTutoringClasses() {
        return tutoringClasses;
    }

    public void setTutoringClasses(HashMap<String, Class> tutoringClasses) {
        this.tutoringClasses = tutoringClasses;
    }

    //setters and getters
    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }
}
