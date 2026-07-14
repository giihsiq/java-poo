package com.udemy.devsuperior.poo.membrosestaticos.exercicios;

public class Converter {
	
	public static double IOF = 0.06;
	
	public static double converterDollarToReal(double dollarBought, double dollarPrice) {
		return dollarBought * dollarPrice * (1.0 + IOF);
	}

	}

