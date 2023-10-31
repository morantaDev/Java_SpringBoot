package com.example.projet_cafeteria.Dao;

import com.example.projet_cafeteria.models.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;


@Repository
public interface TransactionDao extends MongoRepository<Transaction, UUID> {
}
