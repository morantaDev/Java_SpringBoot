package com.example.projet_cafeteria.user;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection  = "users")
public class User {
    private UUID Id;
    private String prenom;
    private String nom;


}
