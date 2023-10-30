package com.example.billpayment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sqlconnection.ConnectJDBC;
import com.example.sqlconnection.ConnectJDBCImpl;
import com.example.sqlconnection.InfoUser;
import com.example.sqlconnection.InitConnectionType;
import com.example.sqlconnection.ReturnType;

@SpringBootApplication
public class BillpaymentApplication {

	@Autowired
	static ConnectJDBC connectJDBC;
	
	public static void main(String[] args)
	{
		final String hostName = "127.0.0.1:3306";
		final String dbName = "databasename";
		final String username = "root";
		final String password = "khunglongcon3";
		int customerID = 45799;
		String providerName = "electricbill";
		InfoUser infoUser = new InfoUser();
		
		SpringApplication.run(BillpaymentApplication.class, args);
		
		
		InitConnectionType initConnection = connectJDBC.InitSQLConnection(hostName, dbName, username, password);
		
		if (initConnection.returnValue == ReturnType.E_OK) {
			infoUser = connectJDBC.GetInfoOneUser(customerID, providerName);
			System.out.println(infoUser.customerID + " - " + infoUser.customerName + " - " + infoUser.billCode + " - " + infoUser.billPayment);
			connectJDBC.UninitSQLConnection();
		}
	}

}
