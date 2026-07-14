package com.udemy.devsuperior.heranca.sobreposicao.polimorfismo.classesabstratas.exercicio;

public class Company extends TaxPayer {
	
	private int numberOfEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		
		double sum = 0.0;
		
		if (getNumberOfEmployees() <= 10) {
			sum = super.getAnualIncome() * 16 / 100;
		} else {
			sum = super.getAnualIncome() * 14 / 100;
		}
		
		return sum;
	}

	@Override
	public String toString() {
		return super.getName()
			         + ": $ "
					 + String.format("%.2f", tax());
	}

}
