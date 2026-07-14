package com.udemy.devsuperior.heranca.sobreposicao.polimorfismo.classesabstratas.exercicio;

public class Individual extends TaxPayer {

	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}


	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {

		double sum = 0.0;
		
		if (getAnualIncome() < 20000.00) {
			sum = super.getAnualIncome() * 0.15;
		} else if (getAnualIncome() >= 20000.00) {
			sum = super.getAnualIncome() * 0.25;
		}
		
		if (getHealthExpenditures() > 0) {
			sum = sum - (getHealthExpenditures() * 0.50);
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
