package com.SpringJDBC.CRUD;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class config {

	
	// step-1) Make Data source 
	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource datasource  =new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/JdbcCurd");
		datasource.setUsername("root");
		datasource.setPassword("Deep@2003");
		return datasource;
	}
	
	@Bean("jdbc")
	
	public JdbcTemplate getJdbctemplate()
	{
		JdbcTemplate jd=new JdbcTemplate();
		jd.setDataSource(getDataSource());
		
		return jd;
	}
	 
}
