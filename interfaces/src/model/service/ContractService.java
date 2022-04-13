package model.service;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	public ContractService() {
		
	}

	public void processContract(Contract contract, Integer months) {
		Double valor = contract.getTotalValue();
		valor = valor / months;
		
		Date data = contract.getDate();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		
		for (int i = 1; i <= months; i++) {
			calendar.add(Calendar.MONTH, 1);
			data = calendar.getTime();
			
			Double valueFee = new PaypalService().paymentFee(valor);
			
			Double totalInstallment = new PaypalService().interest(valueFee, i);
			
			contract.adicionaInstallment(new Installment(data, totalInstallment));

		}

	}

}
