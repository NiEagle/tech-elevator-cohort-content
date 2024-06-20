package com.techelevator.movies.dao;

import com.techelevator.movies.model.Collection;
import com.techelevator.movies.model.Genre;
import com.techelevator.movies.model.Movie;
import com.techelevator.movies.model.Person;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.time.LocalDate;
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
        Person person = null;
        String sql = "SELECT * " +
                "FROM person " +
                "WHERE person_id = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql,id);
        if (results.next()) {
            person = mapRowToPerson(results);
        }
        return person;
    }

    @Override
    public List<Person> getPersonsByName(String name, boolean useWildCard) {
        List<Person> persons = new ArrayList<>();

        String sql = "SELECT * " +
                "FROM person " +
                "WHERE person_name ILIKE ?";

        if (useWildCard)
        {
            name = "%" + name + "%";
        }

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, name);
        while (results.next()) {
            persons.add(mapRowToPerson(results));
        }

        return persons;
    }

    @Override
    public List<Person> getPersonsByCollectionName(String collectionName, boolean useWildCard) {
        List<Person> persons = new ArrayList<>();

        String sql = "SELECT DISTINCT * FROM collection " +
                "JOIN movie ON collection.collection_id = movie.collection_id " +
                "JOIN movie_actor on movie.movie_id = movie_actor.movie_id " +
                "JOIN person on actor_id = person_id " +
                "WHERE collection_name ilike ? ";

        if (useWildCard)
        {
            collectionName = "%" + collectionName + "%";
        }

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, collectionName);
        while (results.next()) {
            persons.add(mapRowToPerson(results));
        }

        return persons;

        //SELECT * FROM collection
        //JOIN movie ON collection.collection_id = movie.collection_id
        //JOIN movie_actor on movie.movie_id = movie_actor.movie_id
        //JOIN person on actor_id = person_id
        //WHERE collection_name ilike ('%kingsman%')
    }
    private Person mapRowToPerson(SqlRowSet rowSet) {
        Person person = new Person();

        if (rowSet.getDate("birthday") != null) {
          person.setBirthday(rowSet.getDate("birthday").toLocalDate());
        }
        if (rowSet.getDate("deathday") != null) {
            person.setDeathDate(rowSet.getDate("deathday").toLocalDate());
        }




        person.setId(rowSet.getInt("person_id"));
        person.setBiography(rowSet.getString("biography"));
        person.setHomePage(rowSet.getString("home_page"));
        person.setName(rowSet.getString("person_name"));
        person.setProfilePath(rowSet.getString("profile_path"));


        return person;
    }
}
