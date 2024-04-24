package api.example.LoginProject.services;

import api.example.LoginProject.models.User;
import api.example.LoginProject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }
    public User updateUser(User user) {
        return userRepository.save(user);
    }
    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }
    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}
