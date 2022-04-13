package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do contrato");
		System.out.print("Numero: ");
		Integer numeroContrato = sc.nextInt();
		sc.nextLine();

		System.out.printf("\nData do contrato(dd/mm/aaaa): ");
		Date dataContrato = sdf.parse(sc.nextLine());


		System.out.printf("\nValor do contrato: ");
		Double valorContrato = sc.nextDouble();

		System.out.printf("\nNúmero de parcelas: ");
		Integer numParcelas = sc.nextInt();

		Contract contract = new Contract(numeroContrato, dataContrato, valorContrato);
		
		ContractService servico = new ContractService();
		servico.processContract(contract, numParcelas);
	
		for(Installment list : contract.getInstallmentList()) {
			System.out.println("Installments: \n" + String.format(sdf.format(list.getDueDate())) + " - R$" + list.getAmount());
		}
			

		sc.close();

	}

}
