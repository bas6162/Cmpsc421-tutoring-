package psu.edu.tutoring;
import java.util.HashMap;

public class User
{
    String fname;
    String lname;
    String password;
    String username;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public HashMap<String, Class> getClasses() {
        return classes;
    }

    public void setClasses(HashMap<String, Class> classes) {
        this.classes = classes;
    }

    public HashMap<Integer, Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(HashMap<Integer, Appointment> appointments) {
        this.appointments = appointments;
    }

    HashMap<String,Class> classes;
    HashMap<Integer, Appointment> appointments;

    public User(String fname, String lname, String password, String username) {
        this.fname = fname;
        this.lname = lname;
        this.password = password;
        this.username = username;
    }

    private int apptId = 0;

    void addClass(Class newClass)
    {
        classes.put(newClass.className,newClass);
    }

    void addAppointment(Appointment appointment)
    {
        appointments.put(apptId,appointment);
        apptId++;
    }
}
