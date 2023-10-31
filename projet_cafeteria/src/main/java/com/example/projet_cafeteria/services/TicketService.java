package com.example.projet_cafeteria.services;

import com.example.projet_cafeteria.Dao.TicketDao;
import com.example.projet_cafeteria.models.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
public class TicketService {

    private final TicketDao ticketDao;

    @Autowired
    public TicketService(TicketDao ticketDao) {
        this.ticketDao = ticketDao;
    }

    public Collection<Ticket> getAllTickets() {
        return ticketDao.findAll();
    }

    public Ticket getTicketById(UUID id) {
        return ticketDao.findById(id).orElse(null);
    }

    public Ticket createTicket(Ticket ticket) {
        // Vous pouvez ajouter ici la logique de validation et de création du ticket
        return ticketDao.save(ticket);
    }

    public Ticket updateTicket(Ticket ticket) {
        // Vous pouvez ajouter ici la logique de mise à jour du ticket
        return ticketDao.save(ticket);
    }

    public Ticket deleteTicket(UUID id) {
        Ticket ticket = getTicketById(id);
        if (ticket != null) {
            ticketDao.delete(ticket);
        }
        return ticket;
    }
}
