package com.example.repository;

import java.sql.Connection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/* Return value for initSQLConnection function */
@Component
@Primary
public class InitConnectionType {
	public ReturnType returnValue;
	public Connection conn;
}
