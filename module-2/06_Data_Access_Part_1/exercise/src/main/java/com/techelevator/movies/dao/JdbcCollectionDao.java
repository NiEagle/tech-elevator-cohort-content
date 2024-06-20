package com.techelevator.movies.dao;

import com.techelevator.movies.model.Collection;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JdbcCollectionDao implements CollectionDao{

    private final JdbcTemplate jdbcTemplate;

    public JdbcCollectionDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Collection> getCollections() {
        List<Collection> Collections = new ArrayList<>();
        String sql = "SELECT * " +
                "FROM collection"
                ;
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            Collections.add(mapRowToCollection(results));
        }
        return Collections;
    }
    @Override
    public Collection getCollectionById(int id) {
        Collection collection = null;
        String sql = "SELECT * " +
                "FROM collection " +
                "WHERE collection_id = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql,id);
        if (results.next()) {
            collection = mapRowToCollection(results);
        }
        return collection;
    }

    @Override
    public List<Collection> getCollectionsByName(String name, boolean useWildCard) {
        List<Collection> Collections = new ArrayList<>();

        String sql = "SELECT * " +
                "FROM collection " +
                "WHERE collection_name ILIKE ?";

        if (useWildCard)
        {
            name = "%" + name + "%";
        }

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, name);
        while (results.next()) {
            Collections.add(mapRowToCollection(results));
        }

        return Collections;
    }
    private Collection mapRowToCollection(SqlRowSet rowSet) {
        Collection collection = new Collection();
        collection.setId(rowSet.getInt("collection_id"));
        collection.setName(rowSet.getString("collection_name"));

        return collection;
    }
}
