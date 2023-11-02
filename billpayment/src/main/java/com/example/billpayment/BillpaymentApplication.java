package com.example.billpayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.repository.JDBCRepository;
import com.example.repository.UserInfo;
import com.example.repository.InitConnectionType;
import com.example.repository.ReturnType;

@SpringBootApplication(scanBasePackages = "com.example")
public class BillpaymentApplication {
	
	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(BillpaymentApplication.class, args);
		
//		final String hostName = "127.0.0.1:3306";
//		final String dbName = "databasename";
//		final String username = "root";
//		final String password = "khunglongcon3";
//		int customerID = 45799;
//		String providerName = "electricbill";
		
//		JDBCRepository jdbcRepository = context.getBean(JDBCRepository.class);
//		UserInfo infoUser = context.getBean(UserInfo.class);
//		
//		InitConnectionType initConnection = jdbcRepository.connectSQL(hostName, dbName, username, password);
		
//		if (initConnection.returnValue == ReturnType.E_OK) 
//		{
//			infoUser = jdbcRepository.getInfoOneUser(customerID, providerName);
//			System.out.println(infoUser.customerID + " - " + infoUser.customerName + " - " + infoUser.billCode + " - " + infoUser.billPayment);
//			jdbcRepository.uninitSQLConnection();
//		}
	}

}
