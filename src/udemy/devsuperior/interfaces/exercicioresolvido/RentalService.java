package udemy.devsuperior.interfaces.exercicioresolvido;

import java.time.Duration;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;
	
	private BrazilTaxService brazilTaxService;
	
	public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService brazilTaxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.brazilTaxService = brazilTaxService;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	
	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60.0;
		
		double basicPayment;
		
		if (hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours); // ceil = arredonda para cima
		} else {
			basicPayment = pricePerDay * Math.ceil(hours / 24.0);
		}
		
		double tax = brazilTaxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
		
	}
	
}
