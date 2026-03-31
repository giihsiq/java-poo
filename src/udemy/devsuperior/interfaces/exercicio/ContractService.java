package udemy.devsuperior.interfaces.exercicio;

import java.time.LocalDate;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {

		for (int i = 1; i <= months; i++) {
			
			double basicQuota = contract.getTotalValue() / months;
			
			LocalDate dueDate = contract.getDate().plusMonths(i); // adiciona o mês do valor na variável i
			double interest = onlinePaymentService.interest(basicQuota, i);
			double fee = onlinePaymentService.paymentFee(interest + basicQuota);
			
			double quota = basicQuota + interest + fee;
			
			contract.getInstallment().add(new Installment(dueDate, quota));
		}
		
	}

}
