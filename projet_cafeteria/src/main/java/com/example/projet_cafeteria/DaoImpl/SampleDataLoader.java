package com.example.projet_cafeteria.DaoImpl;

import com.example.projet_cafeteria.models.User;
import com.example.projet_cafeteria.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class SampleDataLoader implements CommandLineRunner {
    @Autowired
    private UserService userService; // Autowire your UserService

    @Override
    public void run(String... args) throws Exception {
        // Add your sample users here
        User user1 = new User(UUID.randomUUID(), "John", "Doe", 100, "User");
        User user2 = new User(UUID.randomUUID(), "Jane", "Smith", 150, "User");
        User user3 = new User(UUID.randomUUID(), "Alice", "Johnson", 200, "User");
        User user4 = new User(UUID.randomUUID(), "Bob", "Brown", 75, "User");
        User user5 = new User(UUID.randomUUID(), "Eve", "White", 50, "User");

        // Save these users to the database
        userService.createUser(user1);
        userService.createUser(user2);
        userService.createUser(user3);
        userService.createUser(user4);
        userService.createUser(user5);
    }
}
