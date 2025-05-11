package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;


@Repository
public class UserDao 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean insertUser(User user) {
		boolean status = false;
		try 
		{
			String INSERT_SQL_QUERY = "insert into users values(?,?,?,?)";
			int count = jdbcTemplate.update(INSERT_SQL_QUERY, user.getName(), user.getEmail(), user.getGender(), user.getCity());
			if(count>0) status = true;
			else status = false;
		
		} 
		catch (Exception e) {
			// TODO: handle exception
			status = false;
			e.printStackTrace();
		}
		return status;
	}
	public boolean updateUser(User user) 
	{	
		boolean status = false;
		try 
		{
			String update_Sql_query = "update users set name =? where email=?";
			int count = jdbcTemplate.update(update_Sql_query, user.getName(), user.getEmail());
			if(count>0) status = true;

		} 
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return status;
	}
	public boolean deleteUser(User user) 
	{	
		boolean status = false;
		try 
		{
			String delete_Sql_query = "Delete from users where email=?";
			int count = jdbcTemplate.update(delete_Sql_query, user.getEmail());
			if(count>0) status = true;

		} 
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return status;
	}
	public User getUser(String email) 
	{	
		String select_Sql_query = "Select * from users where email=?";
		return jdbcTemplate.queryForObject(select_Sql_query, new UserRowMapper(), email);
			
	}
	public List<User> getAllUsers()
	{
		String select_Sql_query = "Select * from users";
		return jdbcTemplate.query(select_Sql_query, new UserRowMapper());
	}
	
	public static final class UserRowMapper implements RowMapper<User>	{
		@Override
		public User  mapRow(ResultSet rs, int rowNum) throws SQLException 
		{
			User user = new User();
			user.setName(rs.getString("name"));
			user.setEmail(rs.getString("email"));
			user.setGender(rs.getString("gender"));
			user.setCity(rs.getString("city"));
			
			return user;
		}
	}

}
