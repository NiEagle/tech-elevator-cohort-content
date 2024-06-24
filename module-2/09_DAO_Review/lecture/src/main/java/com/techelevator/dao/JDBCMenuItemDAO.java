package com.techelevator.dao;

import com.techelevator.model.MenuItem;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class JDBCMenuItemDAO implements MenuItemDao {
    private JdbcTemplate jdbcTenplate;
    public JBDCMenuItemItemDAO (DataSource dataSource){}
    jdbcTemplate = new JdbcTemplate(dataSource)
    public MenuItem retreiveMenuItemById(int id) {
        return null;
    }

    @Override
    public MenuItem retrieveMenuItemByName(String name) {
        return null;
    }

    @Override
    public List<MenuItem> retrieveMenuItems() {
        return null;
    }

    @Override
    public MenuItem createMenuItem(MenuItem newItem) {
        return null;
    }

    @Override
    public void deleteMenuItem(int movieId) {

    }
}
