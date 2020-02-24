package psu.edu.tutoring;


public class Class {

    String className;
    int classNum;

    public Class(String className, int classNum) {
        this.className = className;
        this.classNum = classNum;
    }

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
}
