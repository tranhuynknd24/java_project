package com.example.service;


public class DataHandlerImpl implements DataHandler {

	@Override
	public boolean CheckPaymentSatatus(final String statusPayment) {
		
		boolean returnValue = true;
		
		if (statusPayment == "NO") {
			returnValue = false;
		}
		return returnValue;
	}
}
