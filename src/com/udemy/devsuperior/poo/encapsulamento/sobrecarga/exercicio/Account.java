package com.udemy.devsuperior.poo.encapsulamento.sobrecarga.exercicio;

public class Account {
	
	private int number;
	private String name;
	private double balance;
	
	public Account() {
	}
	
	public Account(int number, String name, double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getbalance() {
		return balance;
	}
	
	public void setbalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
		+ number
		+ ", Holder: "
		+ name
		+ ", Balance: $ "
		+ String.format("%.2f", balance);
		
	}
	
	}

