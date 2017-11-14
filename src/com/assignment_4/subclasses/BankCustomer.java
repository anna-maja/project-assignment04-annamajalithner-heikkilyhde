/***
 * PersonalAccount
 * 
 * Klassen PersonalAccount i inlämningsuppgift 4.
 * Subklass till BankAccount.
 * 
 * @author Anna-Maja Lithner och Heikki Lyhde
 * @version 1.0
 * @datum 2017-11-08
 */
package com.assignment_4.subclasses;


import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;

import java.util.ArrayList;

public class BankCustomer extends Human {

	private ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();

	/**
	 * constructor av BankCustomer. Skapar en bankkund med värde för namn, ålder och samlade bankkonton.
	 * @param name ärvs från Human (via inmatning i main-metoden).
	 * @param age ärvs från Human (via inmating från main-metoden).
	 * @param bankAccounts lista över kundens konton (via inmatning i main-metoden).
	 */
	public BankCustomer(String name, int age, ArrayList<BankAccount> bankAccounts) {

		super(name, age);
		this.customerAccounts = customerAccounts;
	}
	
	/**
	 * 
	 * @return customerAccounts 
	 */
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}

	/**
	 * 
	 * @param customerAccounts en lista över kundens samtliga bankkonton
	 */
	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
		System.out.println("Används denna?");
	}

	/**
	 * metoden lägger till ett konto till kundens samlade konton
	 * @param bankAccount - värde från BankAccount
	 */
	public void addAccount(BankAccount bankAccount) {
		customerAccounts.add(bankAccount);
	}

	/**
	 * metoden adderar en summa (variabeln amount) till ett givet konto. 
	 * Kontot liksom summan anges i mainmetoden.
	 * Genom en loop eftersöks korrekt kontonummer, och därefter genomförs depositMoney.
	 * @param accountNumber kontonummer
	 * @param amount 
	 */
	public void depositToAccount(String accountNumber, double amount) {

		// skall detta göras som en do-while istället?
		for (int i = 0; i < customerAccounts.size(); i++) { // for-loopen går över hela ArrayList-längden
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).depositMoney(amount);
			}
		}
	}

	/**
	 * metoden drar en summa (variabeln amount) från ett givet konto. 
	 * Kontot liksom summan anges i mainmetoden.
	 * Genom en loop eftersöks korrekt kontonummer, och därefter genomförs withdrawMoney.
	 * @param accountNumber kontonummer
	 * @param amount 
	 */
	public void withdrawFromAccount(String accountNumber, double amount) {

		// skall detta göras som en do-while istället?
		for (int i = 0; i < customerAccounts.size(); i++) { // for-loopen går över hela ArrayList-längden
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).withdrawMoney(amount);
			}
		}
	}

	/**
	 * metoden toString genererar en string med kundens namn och ålder. 
	 * I stringen lagras också alla konton, ett i taget via en loop.
	 */
	public String toString() {
		
		String result = "Customer: [Name: " + getName() + "\tAge: " + getAge() + "]\n";
		
		for (int i = 0; i < customerAccounts.size(); i++) {
			result += customerAccounts.get(i).toString() +"\n";
			
		}
		return result + "\n" ;
	}
}
