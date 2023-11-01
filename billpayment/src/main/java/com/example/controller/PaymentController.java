package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.PaymentService;

@RestController
public class PaymentController
{
	@Autowired
	PaymentService paymentService;
	
	@GetMapping("/billpayment")
	public String payBillController(@RequestParam("customerId") int customerId,
								  @RequestParam("providerName") String providerName,
								  @RequestParam("accountNumber") String accountNumber)
	{
		String returnValue = "Success";
		
		if(false == paymentService.payBillService(customerId, providerName, accountNumber))
		{
			returnValue = "Failed";
		}
		return returnValue;
	}
}
