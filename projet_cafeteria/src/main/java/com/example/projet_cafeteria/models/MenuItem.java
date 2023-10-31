package com.example.projet_cafeteria.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "menuItem")
public class MenuItem {
    @Id
    private UUID id;
    private String nom_menu;
    private Double prix_menu;

    // Getters et Setters


    public MenuItem(UUID id, String nom_menu, Double prix_menu) {
        this.id = id;
        this.nom_menu = nom_menu;
        this.prix_menu = prix_menu;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNom_menu() {
        return nom_menu;
    }

    public void setNom_menu(String nom_menu) {
        this.nom_menu = nom_menu;
    }

    public Double getPrix_menu() {
        return prix_menu;
    }

    public void setPrix_menu(Double prix_menu) {
        this.prix_menu = prix_menu;
    }
}
