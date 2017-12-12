package com.example.demo;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

@Configuration
public class DBInitializer {
	
	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	public void loadIfInMemory() throws Exception {
		ScriptUtils.executeSqlScript( dataSource.getConnection(), new ClassPathResource("insert.sql"));
		ScriptUtils.executeSqlScript( dataSource.getConnection(), new ClassPathResource("insert2.sql"));
	}

}
