package com.example.repository;

public interface JDBCRepository {
	/* Init SQL connection */
	public InitConnectionType connectSQL(final String hostName, final String dbName, final String username, final String password);
	
	/* Get one info user */
	public UserInfo getInfoOneUser(final int customerId, final String providerName);
	
	/* Get all info user */
	
	/* Add data */
	
	/* Update data */
	
	/* Delete data */
	
	/* Unintialized SQL connection */
	public void uninitSQLConnection();
}
