package com.udemy.devsuperior.heranca.sobreposicao;

public class BusinessAccount extends Account {
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super(); // É usado para herdar a mesma lógica usada no construtor da classe principal
	}
	
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	public void withdraw(Double amount) {
		super.withdraw(amount); //super.métodoDaSuperclasse para chamar a implementação da superclasse
		balance -= 2.0;
	}
}
