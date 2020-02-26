package psu.edu.tutoring;

import org.springframework.web.bind.annotation.*;


import java.util.HashMap;

@RestController
public class UserController {
    private HashMap<String, User> users = new HashMap<>();

    @GetMapping("/user/userinfo")
    public User getUserInfo(@RequestParam(name="username") String username) {
        return users.get(username);
    }

    @PostMapping("/user/create")
    public String createNewUser(@RequestBody User user) {
        users.put(user.getUsername(), user);
        return "User " + user.getUsername() + " added";
    }

    @PutMapping("/user/update")
    public String updateUser(@RequestParam(name="username") String username, @RequestBody User user) {
        users.remove(username);
        users.put(username, user);
        return "User " + username + " updated";
    }

    @DeleteMapping("/user/delete")
    public String deleteUser(@RequestParam(name="username") String username) {
        users.remove(username);
        return "User " + username + " deleted";
    }

    @PutMapping("/user/addClass")
    public String addClass(@RequestParam(name = "username") String username,@RequestBody Class aClass)
    {
        users.get(username).addClass(aClass);
        return aClass.className + " has been added to your classes";
    }
}
