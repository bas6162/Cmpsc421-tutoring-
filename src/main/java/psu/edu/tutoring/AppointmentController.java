package psu.edu.tutoring;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class AppointmentController {



    //Wasn't sure about the hashmap
    private HashMap<String, Appointment> appointments = new HashMap<>();

    @GetMapping("/appointment/info")
    public HashMap<String, Appointment> getAppointmentInfo()
    {
        return appointments;
    }

    @PostMapping("/appointement/create")
    public String createAppointment(@RequestBody Appointment appointment, @RequestBody Class classes)
    {
        appointments.put(classes.getClassName(),appointment);
        return "Appointment for " + classes.getClassName() + " added";
    }

    @PutMapping("/appointment/update")
    public String updateAppointemnet(@RequestParam(name="className") String className,@RequestBody Appointment appointment,@RequestBody Class classes)
    {
        appointments.remove(className);
        appointments.put(className, appointment);

        return "Appointemnt for " + className + " updated";
    }

    @DeleteMapping("/apointment/delete")
    public String deleteAppointment(@RequestParam(name="className")String className, @RequestBody Appointment appointment)
    {
        appointments.remove(className);
        return "Appointement for " + className + " removed";
    }





}
