package psu.edu.tutoring;


import java.util.HashMap;

public class Class {

    String className;
    int classNum;


    //Constructor
    public Class(String className, int classNum) {
        this.className = className;
        this.classNum = classNum;
    }


    //Hashmap to add tutors to classes if tutoring more than one class
    HashMap<String,Tutor> tutors;
    void addtutor(Tutor newTutor)
    {
        tutors.put(newTutor.tutorName, newTutor);
    }


    //setters and getters
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    public HashMap<String, Tutor> getTutors() {
        return tutors;
    }

    public void setTutors(HashMap<String, Tutor> tutors) {
        this.tutors = tutors;
    }
}
