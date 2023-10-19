package com.example.projet_cafeteria.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;


@Document(collection = "transactions")
public class Transaction {
    @Id
    private UUID Id;
    private String date_transaction;
    private UUID id_destinataire;

    public Transaction(UUID id, String date_transaction, UUID id_destinataire) {
        Id = id;
        this.date_transaction = date_transaction;
        this.id_destinataire = id_destinataire;
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getDate_transaction() {
        return date_transaction;
    }

    public void setDate_transaction(String date_transaction) {
        this.date_transaction = date_transaction;
    }

    public UUID getId_destinataire() {
        return id_destinataire;
    }

    public void setId_destinataire(UUID id_destinataire) {
        this.id_destinataire = id_destinataire;
    }
}
