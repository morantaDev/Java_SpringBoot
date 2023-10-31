package com.example.projet_cafeteria.services;

import com.example.projet_cafeteria.Dao.MenuDao;
import com.example.projet_cafeteria.models.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
public class MenuService {
    private final MenuDao menuDao;

    @Autowired
    public MenuService(MenuDao menuDao) {
        this.menuDao = menuDao;
    }

    public Menu createMenu(Menu menu) {
        return menuDao.save(menu);
    }

    public Collection<Menu> getAllMenus() {
        return menuDao.findAll();
    }

    public Menu getMenuById(UUID id) {
        return menuDao.findById(id).orElse(null);
    }

    public Menu deleteMenu(UUID id) {
        // Vérifiez si le menu existe
        Menu menu = getMenuById(id);
        if (menu != null) {
            menuDao.deleteById(id);
        }
        return menu;
    }
}
