package psu.edu.tutoring;

public class UserDTO {

    String fname;
    String lname;

    public UserDTO(User user) {
        this.fname = user.fname;
        this.lname = user.lname;
    }

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
}
