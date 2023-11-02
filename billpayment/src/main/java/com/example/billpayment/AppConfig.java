package com.example.billpayment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.repository.InitConnectionType;
import com.example.repository.JDBCRepository;

@Configuration
public class AppConfig {

	/* Lay gia tri config tu file application.properties */
	@Value("${mysql.hostname}")
	String hostName;
	@Value("${mysql.dbname}")
	String dbName;
	@Value("${mysql.username}")
	String username;
	@Value("${mysql.password}")
	String password;
	
	@Autowired
	JDBCRepository jdbcRepository;
	
	@Bean
	public void connectMySQL()
	{
		jdbcRepository.connectSQL(hostName, dbName, username, password);
	}
}
