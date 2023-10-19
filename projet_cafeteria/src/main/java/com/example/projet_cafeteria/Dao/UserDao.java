package com.example.projet_cafeteria.Dao;

import com.example.projet_cafeteria.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.UUID;

public interface UserDao extends MongoRepository<User, UUID> {
    User findByPrenom(String prenom);
    User findByNom(String nom);
    void deleteByPrenom(String prenom);
}
