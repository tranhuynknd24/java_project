package com.example.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*Class contains info of user*/
@Component
@Primary
public class InfoUser {
	public int customerID;
	public String customerName;
	public String customerBirth;
	public String customerAddress;
	public int billCode;
	public int billPayment;
	public String billStatus;
}
