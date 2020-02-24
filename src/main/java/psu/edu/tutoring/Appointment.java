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
}
