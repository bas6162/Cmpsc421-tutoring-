package psu.edu.tutoring;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class AppointmentController {



    //Wasn't sure about the hashmap
    private HashMap<User, Appointment> appointments = new HashMap<>();

    @GetMapping("/appointment/info")
    public HashMap<User, Appointment> getAppointmentInfo()
    {
        return appointments;
    }





}
