package psu.edu.tutoring;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class TutorsController {

    public HashMap<String, Tutor> tutors = new HashMap<>();

    @GetMapping("/tutor/tutorinfo")
    public Tutor getTutorInfo(@RequestParam(name="tutorName")String tutorName,@RequestBody Tutor tutor)
    {
        return tutors.get(tutorName);
    }

    @PostMapping("/tutor/create")
    public String createTutor(@RequestBody Tutor tutor)
    {
        tutors.put(tutor.getTutorName(), tutor);

        return tutor.getTutorName() + " has been added as a tutor";
    }

    @DeleteMapping("/tutor/delete")
    public String deleteTutor(@RequestParam(name="tutorName")String tutorName, @RequestBody Tutor tutor)
    {
        tutors.remove(tutorName, tutor);

        return tutorName + " had been removed as a tutor";
    }





}
