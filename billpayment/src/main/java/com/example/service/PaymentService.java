package com.example.service;

public interface PaymentService {
	/* Check payment status of a user */
	public boolean payBillService(final int customerId, final String providerName, final String accountNumber);
}
