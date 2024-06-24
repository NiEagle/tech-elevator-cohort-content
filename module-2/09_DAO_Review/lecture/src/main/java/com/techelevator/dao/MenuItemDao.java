package com.techelevator.dao;

import com.techelevator.model.MenuItem;

import java.util.List;

public interface MenuItemDao {
    MenuItem retreiveMenuItemById(int id);
    MenuItem retrieveMenuItemByName(String name);
    List<MenuItem> retrieveMenuItems();
    MenuItem createMenuItem(MenuItem newItem);
    void deleteMenuItem(int movieId);
}
