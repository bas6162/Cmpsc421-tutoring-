package psu.edu.tutoring;
import java.util.HashMap;

public class User
{
    String fname;
    String lname;
    String password;
    String username;

    HashMap<String,Class> classes;

    public User(String fname, String lname, String password, String username) {
        this.fname = fname;
        this.lname = lname;
        this.password = password;
        this.username = username;
    }

    void addClass(Class newClass)
    {
        classes.put(newClass.className,newClass);
    }


}
