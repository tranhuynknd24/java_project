package com.example.repository;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class JDBCRepositoryImpl implements JDBCRepository {
	private String query;
	private String dbName;
	@Autowired
	private InitConnectionType mySQL;
	@Autowired
	InfoUser infoUser;
	
	/* Connect SQL */
	@Override
	public InitConnectionType connectSQL(final String hostName, final String dbName, final String username, final String password) {
		String connectionURL = "jdbc:mysql://" + hostName + "/" + dbName;
		
		/* Get database name */
		this.dbName = dbName;
		mySQL.returnValue = ReturnType.E_OK;
		try {
			mySQL.conn = DriverManager.getConnection(connectionURL, username, password);
			System.out.println(" Connect successfully ");
		} catch (SQLException e) {
			// TODO Auto-genera ted catch block
			e.printStackTrace();
			System.out.println(e.toString());
			mySQL.returnValue = ReturnType.E_NOT_OK;
		}
		return mySQL;
	}
	
	/* Get one info user */
	@Override
	public InfoUser getInfoOneUser(final int customerId, final String providerName) {
		PreparedStatement pstm = null;
		
		query = "SELECT * FROM " + this.dbName + "." + providerName + " WHERE CustomerID = ?";
		try {
			/* Create Statement object */
			pstm = mySQL.conn.prepareStatement(query);
			/* Assigned value to parameter */
			pstm.setInt(1, 45799);
			/* Execute the query and return a ResultSet object */
			ResultSet rs = pstm.executeQuery();
			/* Get info user */
			if(rs.next()) {
				infoUser.customerID = rs.getInt("CustomerID");
				infoUser.customerName = rs.getString("CustomerName");
				infoUser.customerBirth = rs.getString("CustomerBirth");
				infoUser.customerAddress = rs.getString("CustomerAddress");
				infoUser.billCode = rs.getInt("BillCode");
				infoUser.billPayment = rs.getInt("BillPayment");
				infoUser.billStatus = rs.getString("BillStatus");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.toString();
		}
		
		return infoUser;
	}
	
	/* Get all info user */
	
	/* Add data */
	
	/* Update data */
	
	/* Delete data */
	
	/* Unintialized SQL connection */
	public void uninitSQLConnection() {
		try {
			mySQL.conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
