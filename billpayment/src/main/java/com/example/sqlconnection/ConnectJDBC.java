package com.example.sqlconnection;

public interface ConnectJDBC {
	/* Init SQL connection */
	public InitConnectionType InitSQLConnection(final String hostName, final String dbName, final String username, final String password);
	
	/* Get one info user */
	public InfoUser GetInfoOneUser(final int customerId, final String providerName);
	
	/* Get all info user */
	
	/* Add data */
	
	/* Update data */
	
	/* Delete data */
	
	/* Unintialized SQL connection */
	public void UninitSQLConnection();
}
