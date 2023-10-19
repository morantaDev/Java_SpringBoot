package com.example.projet_cafeteria.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "cafeteria")
public class Cafeteria {
    @Id
    private UUID Id;
    private String nom;
    private String emplacement;

    public Cafeteria(UUID id, String nom, String emplacement) {
        Id = id;
        this.nom = nom;
        this.emplacement = emplacement;
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
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
