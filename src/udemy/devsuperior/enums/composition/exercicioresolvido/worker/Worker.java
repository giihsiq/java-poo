package udemy.devsuperior.enums.composition.exercicioresolvido.worker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
	
	private String name;
	private WorkerLevel worker;
	private Double baseSalary;
	
	private Department departament;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
	}
	
	public Worker(String name, WorkerLevel worker, Double baseSalary, Department departament) {
		this.name = name;
		this.worker = worker;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getWorker() {
		return worker;
	}

	public void setWorker(WorkerLevel worker) {
		this.worker = worker;
	}

	public Double getbaseSalary() {
		return baseSalary;
	}

	public void setbaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartament() {
		return departament;
	}

	public void setDepartament(Department departament) {
		this.departament = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
		
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
		
	}
	
	public Double income(Integer year, Integer month) {
		double sumTotalValue = baseSalary;
		
		Calendar calendar = Calendar.getInstance();
		
		for (HourContract c : contracts) {
			calendar.setTime(c.getDate());
			
			int cYear = calendar.get(Calendar.YEAR);
			int cMonth = calendar.get(1 + Calendar.MONTH);
			
			if (year == cYear && month == cMonth) {
				sumTotalValue += c.totalValue();
			}
		}
		
		return sumTotalValue;
	}
}
