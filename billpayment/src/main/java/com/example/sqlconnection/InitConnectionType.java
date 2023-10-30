package com.example.sqlconnection;

import java.sql.Connection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class InitConnectionType {
	public ReturnType returnValue;
	public Connection conn;
}
