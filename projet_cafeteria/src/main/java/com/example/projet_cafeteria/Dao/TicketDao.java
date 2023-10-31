package com.example.projet_cafeteria.Dao;

import com.example.projet_cafeteria.models.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.UUID;

public interface TicketDao extends MongoRepository<Ticket, UUID> {
}
