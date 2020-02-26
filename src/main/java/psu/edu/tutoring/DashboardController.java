package psu.edu.tutoring;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class DashboardController {

    @GetMapping("/user/classes")
    public HashMap<String, Class> getUserClasses(@RequestBody User user)
    {
        return user.classes;

    }

    @GetMapping("/user/appointments")
    public HashMap<Integer, Appointment> getUserAppointments(@RequestBody User user)
    {
        return user.appointments;
    }



}
