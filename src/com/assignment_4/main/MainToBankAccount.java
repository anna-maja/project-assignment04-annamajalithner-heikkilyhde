/***
 * MainToBankAccount
 * 
 * innehåller main-metod till inlämningsuppgift 4.
 * 
 * @author Anna-Maja Lithner och Heikki Lyhde 
 * @version 1.0
 * @date 2017-11-08
 */

package com.assignment_4.main;

import java.util.ArrayList;


import com.assignment_4.subclasses.BankCustomer;
import com.assignment_4.subclasses.PersonalAccount;
import com.assignment_4.subclasses.SavingAccount;
import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;

public class MainToBankAccount {

	/**
	 * Main-metod. 
	 * Tar in BankCustomer, BankAccount, PersonalAccount och SavingAccount. 
	 * Anropar metoder för att skapa kund och konton, göra insättningar och uttag, 
	 * samt för att skriva ut information om kund och konton. 
	 * @param args String[].
	 **/
	public static void main(String[] args) {
		
		String account = "";
		
		// create customer
		BankCustomer bc = new BankCustomer("Anna-Maja", 46, null);
		
		// create accounts
		bc.addAccount(new BankAccount());
		bc.addAccount(new PersonalAccount());
		bc.addAccount(new SavingAccount());
		System.out.println(bc.toString());
	
		// deposits and withdrawals
		account = bc.getCustomerAccounts().get(0).getAccountNumber();
		System.out.println("Deposit 30.0 to first account of " + bc.getName());
		bc.depositToAccount(account, 30.0);
		System.out.println(bc.toString());
		
		System.out.println("Withdrawing 200.0 from second account of "+ bc.getName());
		account = bc.getCustomerAccounts().get(1).getAccountNumber();
		bc.withdrawFromAccount(account, 200.0);
		System.out.println(bc.toString());
		
		System.out.println("Deposit 200.0 to third account of " + bc.getName());
		account = bc.getCustomerAccounts().get(2).getAccountNumber();
		bc.depositToAccount(account, 200);
		System.out.println(bc.toString());
			
		}
}
