package psu.edu.tutoring;

public class Appointment
{
    User user;
    Tutor tutor;
    Class aClass;
    int startTime;
    int endTime;

    public Appointment(User user, Tutor tutor, Class aClass, int startTime, int endTime) {
        this.user = user;
        this.tutor = tutor;
        this.aClass = aClass;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
}
