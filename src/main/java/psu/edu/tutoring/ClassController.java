package psu.edu.tutoring;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class ClassController
{
    HashMap<Integer,Class> offeredClasses;

    @PostMapping("/class/create")
    String createClass(@RequestBody Class newClass)
    {
        offeredClasses.put(newClass.classNum,newClass);
        return newClass.className + " has been added";
    }

    @DeleteMapping("/class/delete")
    String deleteClass(@RequestParam(name = "id") int id)
    {
        String cName = offeredClasses.get(id).className;

        offeredClasses.remove(id);
        return cName + " has been deleted";
    }

    @PutMapping("/class/update")
    String updateClass(@RequestBody Class uClass)
    {
        offeredClasses.remove(uClass.classNum);

        offeredClasses.put(uClass.classNum, uClass);

        return uClass.className + " has been updated";
    }
}
