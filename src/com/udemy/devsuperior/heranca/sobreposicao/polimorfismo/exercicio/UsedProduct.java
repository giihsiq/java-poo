package com.udemy.devsuperior.heranca.sobreposicao.polimorfismo.exercicio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	SimpleDateFormat manufactureDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public final String priceTag() {
		return super.priceTag();
	}

	@Override
	public String toString() {
		return super.getName()
			   + " (used) $ "
			   + super.getPrice()
			   + " (Manufacture date: "
			   + manufactureDateFormat.format(getManufactureDate())
			   + ")";
	}
	
	
	
}
