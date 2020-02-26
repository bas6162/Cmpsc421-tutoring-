package psu.edu.tutoring;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;

@RestController
public class DashboardController {

    @GetMapping("/user/classes")
    public HashMap<String, Class> getUserClasses(@RequestParam(name="className")String className, @RequestBody User user)
    {
        return user.getClass(className);
    }

    @GetMapping("/user/appointments")
    public HashMap<Integer, Appointment> getUserAppointments(@RequestBody User user)
    {
        return user.appointments;
    }


}
