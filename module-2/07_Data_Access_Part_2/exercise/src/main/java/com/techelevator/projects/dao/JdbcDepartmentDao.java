package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.exception.DaoException;
import com.techelevator.projects.model.Department;

public class JdbcDepartmentDao implements DepartmentDao {

	private final String DEPARTMENT_SELECT = "SELECT d.department_id, d.name FROM department d ";
	
	private final JdbcTemplate jdbcTemplate;

	public JdbcDepartmentDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Department getDepartmentById(int id) {
		Department department = null;
			try{
				String sql = DEPARTMENT_SELECT +
						" WHERE d.department_id=?";

				SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
				if (results.next()) {
					department = mapRowToDepartment(results);
				}

				}
				catch (DataIntegrityViolationException e) {
				throw new DaoException("Error retrieving department", e);
				}
				catch (CannotGetJdbcConnectionException e) {
				throw new DaoException("nope", e);
			}

			return department;
	}

	@Override
	public List<Department> getDepartments() {

		List<Department> departments = new ArrayList<>();
		String sql = DEPARTMENT_SELECT;
		try{
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
			while (results.next()) {
			departments.add(mapRowToDepartment(results));

			}
		}
		catch (DataIntegrityViolationException e) {
			throw new DaoException("Error retrieving department", e);
		}
		catch (CannotGetJdbcConnectionException e) {
			throw new DaoException("nope", e);
		}

		return departments;
	}

	@Override
	public Department createDepartment(Department department) {
		try{
		String sql = "INSERT INTO department (name)" +
				"VALUES (?) RETURNING department_id;";
		int departmentId = jdbcTemplate.queryForObject(sql, int.class, department.getName());

		return getDepartmentById(departmentId);
	} catch (DataIntegrityViolationException e) {
			throw new DaoException("Error creating department", e);
		} catch (CannotGetJdbcConnectionException e) {
		throw new DaoException("Unable to connect to server or database", e);
	}
	}


	@Override
	public Department updateDepartment(Department department) {
		try{
		String sql = "UPDATE department " +
				"SET name = ? " +
				"WHERE department_id=?;";

		jdbcTemplate.update(sql, department.getName(), department.getId());

		}catch (DataIntegrityViolationException e){
		throw new DaoException("Error in updating Department ",e);
		}
		catch (CannotGetJdbcConnectionException e) {
			throw new DaoException("Unable to connect to server or database", e);
		}
		return getDepartmentById(department.getId());
	}

	@Override
	public int deleteDepartmentById(int id) {
		int numberOfRows = 0;
		String updateEmployeeSql = "UPDATE employee SET department_id = 0 WHERE department_id = ?";
		String deleteDepartmentSql = "DELETE " +
				" FROM department WHERE department_id=?;";

		try{		;
			jdbcTemplate.update(updateEmployeeSql,id );
			numberOfRows = jdbcTemplate.update(deleteDepartmentSql,id );

		} catch (CannotGetJdbcConnectionException e) {
			throw new DaoException("Unable to connect to server or database", e);
		} catch (DataIntegrityViolationException e) {
			throw new DaoException("Data integrity violation", e);
		}

		return numberOfRows;
	}

	private Department mapRowToDepartment(SqlRowSet results) {
		Department department = new Department();
		department.setId(results.getInt("department_id"));
		department.setName(results.getString("name"));
		return department;
	}

}
