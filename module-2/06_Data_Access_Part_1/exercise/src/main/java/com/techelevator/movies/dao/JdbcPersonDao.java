package com.techelevator.movies.dao;

import com.techelevator.movies.model.Collection;
import com.techelevator.movies.model.Movie;
import com.techelevator.movies.model.Person;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcPersonDao implements PersonDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcPersonDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Person> getPersons() {
        List<Person> persons = new ArrayList<>();
        String sql = "SELECT * " +
                "FROM person"
                ;
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            persons.add(mapRowToPerson(results));
        }
        return persons;
    }

    @Override
    public Person getPersonById(int id) {
        return new Person(-1, "Not implemented yet", null, null, "", "", "");
    }

    @Override
    public List<Person> getPersonsByName(String name, boolean useWildCard) {
        return null;
    }

    @Override
    public List<Person> getPersonsByCollectionName(String collectionName, boolean useWildCard) {
        return null;
    }
    private Person mapRowToPerson(SqlRowSet rowSet) {
        Person person = new Person();
        person.setId(rowSet.getInt("person_id"));
        person.setBirthday(rowSet.getDate("birthday").toLocalDate());
        person.setBiography(rowSet.getString("biography"));
        person.setDeathDate(rowSet.getDate("deathday").toLocalDate());
        person.setHomePage(rowSet.getString("home_page"));
        person.setName(rowSet.getString("person_name"));
        person.setProfilePath(rowSet.getString("profile_path"));



        return person;
    }
}
