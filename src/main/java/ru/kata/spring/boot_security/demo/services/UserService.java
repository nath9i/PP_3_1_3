package ru.kata.spring.boot_security.demo.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> getAllUsers();
    void createOrUpdateUser(User user);
    void deleteUser(int id);
    User getUserById(int id);
    User getUserByUsername(String name);
}
