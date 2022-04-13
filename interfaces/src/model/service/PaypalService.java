package model.service;

public class PaypalService implements OnlinePaymentService{
	
	public PaypalService() {
		
	}

	
	public Double paymentFee(Double amount) {
		Double amountFee = amount;
		amountFee += amount * 0.02;
		
		return amountFee;
	}

	
	public Double interest(Double amount, Integer months) {
		Double payments = amount;  
		payments += amount * 0.01 *  months;
		return payments;
	}
	

}
