package udemy.devsuperior.heranca;

public class Main {

	public static void main(String[] args) {

		Account account = new Account(1001, "Alex", 0.0);
		BusinessAccount businessAccount = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// Upcasting - (subclasse convertendo os tipos de referência da classe principal/super classe/classe pai)
		Account account1 = businessAccount;
		Account account2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account account3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// Downcasting - (classe principal convertendo os tipos de referência da subclasse)
		BusinessAccount businessAccount1 = (BusinessAccount)account2;
		businessAccount1.loan(100.0);
		
		if (account3 instanceof BusinessAccount) {
		BusinessAccount businessAccount2 = (BusinessAccount)account3;
		businessAccount2.loan(200.0);
		
		System.out.println("Loan!");
		
		}
		
		if (account3 instanceof SavingsAccount) {
		SavingsAccount acc5 = (SavingsAccount)account3;
		acc5.updateBalance();
		
		System.out.println("Update!");
		
		}
		
	}

}
