package model.service;

public class ServicoGeraParcela {
	// valor base que será passado no programa principal
	private Double baseValue;
	
	// número atual da parcela passado pelo programa principal
	private Integer installmentNumber;
	//private InterfacePagamentoOnline iPagamentoOnline;
	

	public ServicoGeraParcela(Double baseValue, Integer installmentNumber) {
		this.baseValue = baseValue;
		this.installmentNumber = installmentNumber;
	//	this.iPagamentoOnline = new ServicoCalculaPagamentoOnline();
		
	}
	
	public Double calculaParcela() {
		return new ServicoCalculaPagamentoOnline().calculaParcela(this.baseValue, this.installmentNumber);
	}
	public Double calculaParcelaMp() {
		return new ServicoCalculaPagamentoOnlineMp().calculaParcela(this.baseValue, this.installmentNumber);
	}
	
}
