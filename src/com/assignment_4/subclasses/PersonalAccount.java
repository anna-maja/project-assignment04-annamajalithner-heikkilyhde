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

import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;

public class PersonalAccount extends BankAccount {

	/**
	 * constructor utan parametrar. skapar ett kontonummer med 6 bokstäver och
	 * siffror, genererade av randomUUID() sätter värdet på balance. sätter värde på
	 * accountType.
	 */
	public PersonalAccount() {

		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0);
		this.setAccountType("Personal Account");
	}

}
