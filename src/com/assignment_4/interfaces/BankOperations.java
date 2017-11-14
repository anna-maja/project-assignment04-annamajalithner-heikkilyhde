/***
 * BankOperations
 * 
 * interface till inlämningsuppgift 4.
 * 
 * @author Anna-Maja Lithner och Heikki Lyhde 
 * @version 1.0
 * @date 2017-11-08
 */
package com.assignment_4.interfaces;

public interface BankOperations {
	
	/***
	 * metod för uttag.
	 * implementeras i klasen BankAccount.
	 * @param amount av typen double.
	 */
	void withdrawMoney(double amount);

	/***
	 * metod för insättning.
	 * implementeras i klasen BankAccount.
	 * @param amount av typen double.
	 */
	void depositMoney(double amount);
	
}
