package com.example.projet_cafeteria.services;

import com.example.projet_cafeteria.Dao.MenuItemDao;
import com.example.projet_cafeteria.models.MenuItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
public class MenuItemService {
    private final MenuItemDao menuItemDao;

    public MenuItemService(MenuItemDao menuItemDao) {
        this.menuItemDao = menuItemDao;
    }

    public MenuItem createMenuItem(MenuItem menuItem) {
        return menuItemDao.save(menuItem);
    }

    public Collection<MenuItem> getAllMenuItems() {
        return menuItemDao.findAll();
    }

    public MenuItem updateMenuItem(UUID id, MenuItem menuItem) {
        // Vérifiez si l'élément existe
        MenuItem existingMenuItem = menuItemDao.findById(id).orElse(null);
        if (existingMenuItem != null) {
            // Mettez à jour les propriétés de l'élément existant avec les valeurs du nouveau MenuItem
            existingMenuItem.setNom_menu(menuItem.getNom_menu());
            existingMenuItem.setPrix_menu(menuItem.getPrix_menu());
            return menuItemDao.save(existingMenuItem);
        }
        return null; // Ou lancez une exception en cas de MenuItem non trouvé
    }

    public MenuItem deleteMenuItem(UUID id) {
        // Vérifiez si l'élément existe
        MenuItem menuItem = menuItemDao.findById(id).orElse(null);
        if (menuItem != null) {
            menuItemDao.deleteById(id);
        }
        return menuItem;
    }
}

