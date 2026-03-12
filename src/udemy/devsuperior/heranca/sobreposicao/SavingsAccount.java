package udemy.devsuperior.heranca.sobreposicao;

// final = a classe não pode ser herdada

public final class SavingsAccount extends Account {

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	// Annotation indica que está sobrepondo o mesmo método da classe Account sem taxa
	@Override
	public void withdraw(Double amount) {
		balance -= amount;
	}
	
}
