package com.example.projet_cafeteria.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection  = "users")
public class User {
    @Id
    private UUID id;
    private String prenom;
    private String nom;
    private Integer solde;
    private String role;

    public User(UUID id, String prenom, String nom, Integer solde, String role) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.solde = solde;
        this.role = role;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getSolde() {
        return solde;
    }

    public void setSolde(Integer solde) {
        this.solde = solde;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
