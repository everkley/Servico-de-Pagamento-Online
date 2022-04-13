package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	private Integer number;
	private Date date;
	private Double totalValue;
	//Relacionamento com installment 1 pra muitos
	
	private List<Installment> installmentList = new ArrayList<Installment>();
	
	
	public Contract() {
		
	}
	
	public Contract(Integer number, Date date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}
	
	public Contract(Integer number, Date date, Double totalValue, List<Installment> installmentList) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.installmentList = installmentList;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallmentList() {
		return installmentList;
	}

	public void adicionaInstallment(Installment installment) {
		this.installmentList.add(installment);
	}
	
	
	
	
	
	
	
}
