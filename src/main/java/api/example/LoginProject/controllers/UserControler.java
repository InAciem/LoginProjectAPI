package api.example.LoginProject.controllers;

import api.example.LoginProject.models.User;
import api.example.LoginProject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserControler {
    @Autowired
    private UserService userService;
    @GetMapping("/get")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @PostMapping("/add")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }
    @PutMapping("/update")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }
    @GetMapping("/get/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUserById(@PathVariable int id) {
        userService.deleteUserById(id);
    }
    @DeleteMapping("/delete")
    public void deleteUser(@RequestBody User user) {
        userService.deleteUser(user);
    }
}
