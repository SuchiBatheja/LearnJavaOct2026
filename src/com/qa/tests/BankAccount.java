package com.qa.tests;

public class BankAccount {
 private double balance; //Hidden from direct Access
 
 public BankAccount(double initialBalance) {
	 
	 this.balance=initialBalance;	 
 }
	
 //Controlled Getter
	public double getBalance() {
		
		return balance;
	}
	
	//Controlled Setter with Validation
		public void deposit(double amount) {
		if(amount>0) {
						balance+=amount;
		}
		
	}

}
