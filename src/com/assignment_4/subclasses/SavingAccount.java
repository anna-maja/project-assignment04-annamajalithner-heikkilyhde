package com.assignment_4.subclasses;
/***
 * SavingAccount
 * 
 * Klassen SavingAccount i inlämningsuppgift 4.
 * Subklass till BankAccount.
 * 
 * @author Anna-Maja Lithner och Heikki Lyhde
 * @version 1.0
 * @datum 2017-11-08
 */
import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;

import java.util.Random;
import java.lang.Math;

public class SavingAccount extends BankAccount {

	/**
	 * constructor utan parametrar. skapar ett kontonummer med 6 bokstäver och
	 * siffror, genererade av randomUUID() sätter värdet på balance. sätter värde på
	 * accountType.
	 */
	public SavingAccount() {

		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0);
		this.setAccountType("Saving Account");
	}

}
