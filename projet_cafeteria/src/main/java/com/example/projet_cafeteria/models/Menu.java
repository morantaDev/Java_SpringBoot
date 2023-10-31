package com.example.projet_cafeteria.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Document(collection = "menu")
public class Menu {
    @Id
    private UUID id;
    private Date date_menu;
    private String jour_de_la_semaine;
    private ArrayList<MenuItem> plats_disponibles;

    public Menu(UUID id, Date date_menu, String jour_de_la_semaine, ArrayList<MenuItem> plats_disponibles) {
        this.id = id;
        this.date_menu = date_menu;
        this.jour_de_la_semaine = jour_de_la_semaine;
        this.plats_disponibles = plats_disponibles;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getDate_menu() {
        return date_menu;
    }

    public void setDate_menu(Date date_menu) {
        this.date_menu = date_menu;
    }

    public String getJour_de_la_semaine() {
        return jour_de_la_semaine;
    }

    public void setJour_de_la_semaine(String jour_de_la_semaine) {
        this.jour_de_la_semaine = jour_de_la_semaine;
    }

    public ArrayList<MenuItem> getPlats_disponibles() {
        return plats_disponibles;
    }

    public void setPlats_disponibles(ArrayList<MenuItem> plats_disponibles) {
        this.plats_disponibles = plats_disponibles;
    }
}


