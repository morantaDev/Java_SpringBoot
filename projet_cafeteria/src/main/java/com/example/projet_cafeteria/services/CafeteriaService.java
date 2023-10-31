package com.example.projet_cafeteria.services;

import com.example.projet_cafeteria.Dao.CafeteriaDao;
import com.example.projet_cafeteria.models.Cafeteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
public class CafeteriaService {
    private final CafeteriaDao cafeteriaDao;

    @Autowired
    public CafeteriaService(CafeteriaDao cafeteriaDao) {
        this.cafeteriaDao = cafeteriaDao;
    }

    public Cafeteria createCafeteria(Cafeteria cafeteria) {
        return cafeteriaDao.save(cafeteria);
    }

    public Collection<Cafeteria> getAllCafeterias() {
        return cafeteriaDao.findAll();
    }

    public Cafeteria getCafeteriaById(UUID id) {
        return cafeteriaDao.findById(id).orElse(null);
    }

    public Cafeteria deleteCafeteria(UUID id) {
        // Vérifiez si la cafétéria existe
        Cafeteria cafeteria = getCafeteriaById(id);
        if (cafeteria != null) {
            cafeteriaDao.deleteById(id);
        }
        return cafeteria;
    }
}
