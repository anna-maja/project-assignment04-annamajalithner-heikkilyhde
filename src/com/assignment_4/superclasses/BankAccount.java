/***
 * BankAccount
 * 
 * klassen BankAccount till inlämningsuppgift 4.
 * superklass till PersonalAccount och SavingAccount.
 * 
 * @author Anna-Maja Lithner och Heikki Lyhde 
 * @version 1.0
 * @date 2017-11-08
 */

package com.assignment_4.superclasses;

import java.util.UUID;

import com.assignment_4.interfaces.BankOperations;

public class BankAccount implements BankOperations {

	// attributes
	String accountNumber = "";
	String accountType = "";
	double balance = 0.0;

	/**
	 * constructor utan parametrar. skapar ett kontonummer med 6 bokstäver och
	 * siffror, genererade av randomUUID() sätter värdet på balance sätter värde på
	 * accountType
	 */
	public BankAccount() {
		super();
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.accountType = "Bank Account";
		this.balance = 0;
	}

	/**
	 * @return accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * 
	 * @return accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * 
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * 
	 * @param accountNumber
	 *            6 tecken som genereras av randomUUID
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * 
	 * @param accountType
	 *            den kontotyp som angetts in konstruktorn
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * 
	 * @param balance
	 *            värdet på balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * implementation av metoden withdrawMoney() från interface. Metoden
	 * kontrollerar så att summan som matas in inte innehåller ett otillåtet värde
	 * (noll eller negativt värde)
	 */
	public void withdrawMoney(double amount) {

		if (amount >= 0) {
			setBalance(getBalance() - amount);
		} else {
			System.out.println(
					"You are tying to withdraw an unallowed amount.\nWithdrawal of zero or negative value is not possible.");
		}
	}

	/**
	 * implementation av metoden depositMoney() från interface. Metoden kontrollerar
	 * så att summan som matas in inte innehåller ett otillåtet värde (noll eller
	 * negativt värde)
	 */
	public void depositMoney(double amount) {

		if (amount >= 0) {
			setBalance(getBalance() + amount);
		} else {
			System.out.println("You are trying to make a deposit of an unallowed amount.\nDeposit must be over 0 SEK.");
		}
	}

	/**
	 * metoden toString genererar en string med aktuellt värde i accountNumber,
	 * accountType och balance.
	 */
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountType=" + accountType + ", balance=" + balance
				+ "]";
	}

}
