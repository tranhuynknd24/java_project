package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.UserInfo;
import com.example.repository.JDBCRepository;
import com.example.repository.ReturnType;

@Service
public class PaymentServiceImpl implements PaymentService
{
	@Autowired
	private JDBCRepository jdbcRepository;
	@Autowired
	private UserInfo userInfo;
	
	@Override
	public boolean payBillService(final int customerId, final String providerName, final String accountNumber)
	{
		boolean returnValue = true;
		
		userInfo = jdbcRepository.getInfoOneUser(customerId, providerName);
		returnValue = checkPaymentSatatus(userInfo.billStatus);
		if (returnValue == false) 
		{
			if (true == checkAccountBalance(accountNumber))
			{
				userInfo = jdbcRepository.getInfoOneUser(customerId, providerName);
				returnValue = checkPaymentSatatus(userInfo.billStatus);
				if (returnValue == false)
				{
					returnValue = payBill(accountNumber);
				}
			}
		}
		
		return returnValue;
	}
	
	public boolean checkPaymentSatatus(final String billStatus) 
	{
		boolean returnValue = true;
		
		if (billStatus == "NO") {
			returnValue = false;
		}
		return returnValue;
	}
	
	public boolean checkAccountBalance(final String accInfo) {
		boolean returnValue = true;
		
		return returnValue;
	}
	
	public boolean payBill(final String accountNumber)
	{
		boolean returnValue = true;
		
		return returnValue;
	}
}
