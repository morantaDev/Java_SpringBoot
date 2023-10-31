package com.example.projet_cafeteria.Dao;

import com.example.projet_cafeteria.models.Cafeteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CafeteriaDao extends MongoRepository<Cafeteria, UUID> {
}
