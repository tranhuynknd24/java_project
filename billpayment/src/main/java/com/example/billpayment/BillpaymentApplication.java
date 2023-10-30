package com.example.billpayment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.repository.JDBCRepository;
import com.example.repository.JDBCRepositoryImpl;
import com.example.repository.InfoUser;
import com.example.repository.InitConnectionType;
import com.example.repository.ReturnType;

@SpringBootApplication
public class BillpaymentApplication {

	@Autowired
	static JDBCRepository jdbcRepository;
	
	public static void main(String[] args)
	{
		SpringApplication.run(BillpaymentApplication.class, args);
		
		final String hostName = "127.0.0.1:3306";
		final String dbName = "databasename";
		final String username = "root";
		final String password = "khunglongcon3";
		int customerID = 45799;
		String providerName = "electricbill";
		InfoUser infoUser = new InfoUser();
		
		InitConnectionType initConnection = jdbcRepository.connectSQL(hostName, dbName, username, password);
		
		if (initConnection.returnValue == ReturnType.E_OK) {
			infoUser = jdbcRepository.getInfoOneUser(customerID, providerName);
			System.out.println(infoUser.customerID + " - " + infoUser.customerName + " - " + infoUser.billCode + " - " + infoUser.billPayment);
			jdbcRepository.uninitSQLConnection();
		}
	}

}
