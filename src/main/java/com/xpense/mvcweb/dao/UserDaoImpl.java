package com.xpense.mvcweb.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xpense.mvcweb.model.User;

public class UserDaoImpl implements UserDao{

	@Autowired
	private DataSource dataSource;
	@Override
	public boolean validateUser(User user) {
		try{
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			
			String query="SELECT user FROM admin_log WHERE user='"+user.getUsername()+"' AND pass='"+user.getPassword()+"'";
			System.out.println(query);
			
			String dbUserName = jdbcTemplate.queryForObject(query, String.class);
			if(dbUserName != null & dbUserName.equals(user.getUsername())){
				return true;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

}
