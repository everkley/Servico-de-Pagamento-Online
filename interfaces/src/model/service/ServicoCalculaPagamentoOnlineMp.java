package model.service;

public class ServicoCalculaPagamentoOnlineMp implements InterfacePagamentoOnline {
	
	public Double calculaParcela(Double valorBase, Integer installmentNumber) {
		Double valorCalculado;
		valorCalculado = valorBase;
		valorCalculado += valorBase * 0.01 * installmentNumber;
		valorCalculado += valorCalculado * 0.02;
		
		return valorCalculado * -1;
	}
}
