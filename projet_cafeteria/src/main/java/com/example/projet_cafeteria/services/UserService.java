package com.example.projet_cafeteria.services;

import com.example.projet_cafeteria.Dao.UserDao;
import com.example.projet_cafeteria.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {
    private final UserDao repository;

    @Autowired
    public UserService(UserDao repository) {
        this.repository = repository;
    }

    public Collection<User> getAllUsers() {
        return repository.findAll();
    }

    public User getUserByPrenom(String prenom) {
        return repository.findByPrenom(prenom);
    }

    public User createUser(User user) {
        return repository.save(user);
    }

    public User deleteUserByPrenom(String prenom) {
        User user = repository.findByPrenom(prenom);
        if (user != null) {
            repository.deleteByPrenom(prenom);
        }
        return user;
    }

    public User updateUser(User user, String prenom) {
        User existingUser = repository.findByPrenom(prenom);
        if (existingUser == null) {
            throw new RuntimeException("User not found");
        }
        existingUser.setId(user.getId());
        existingUser.setPrenom(user.getPrenom());
        existingUser.setNom(user.getNom());
        existingUser.setSolde(user.getSolde());
        existingUser.setRole(user.getRole());
        return repository.save(existingUser);
    }
}
