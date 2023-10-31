package com.example.projet_cafeteria.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "cafeteria")
public class Cafeteria {
    @Id
    private UUID id;
    private String nom;
    private String emplacement;

    public Cafeteria(UUID id, String nom, String emplacement) {
        this.id = id;
        this.nom = nom;
        this.emplacement = emplacement;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }
}
