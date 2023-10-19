package com.example.projet_cafeteria.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;


@Document(collection = "tickets")
public class Ticket {
    @Id
    private UUID Id;
    private String type_ticket;
    private Boolean utilise;
    private Date date_achat;

    public Ticket(UUID id, String type_ticket, Boolean utilise, Date date_achat) {
        Id = id;
        this.type_ticket = type_ticket;
        this.utilise = utilise;
        this.date_achat = date_achat;
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getType_ticket() {
        return type_ticket;
    }

    public void setType_ticket(String type_ticket) {
        this.type_ticket = type_ticket;
    }

    public Boolean getUtilise() {
        return utilise;
    }

    public void setUtilise(Boolean utilise) {
        this.utilise = utilise;
    }

    public Date getDate_achat() {
        return date_achat;
    }

    public void setDate_achat(Date date_achat) {
        this.date_achat = date_achat;
    }
}
