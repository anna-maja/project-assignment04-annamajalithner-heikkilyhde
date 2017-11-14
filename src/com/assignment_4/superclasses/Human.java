/***
 * Human
 * 
 * klassen Human, superklass i inlämningsuppgift 4.
 * 
 * @author Anna-Maja Lithner och Heikki Lyhde 
 * @version 1.0
 * @date 2017-11-08
 */
package com.assignment_4.superclasses;


public class Human {
	
	// attributes
	private String name = "";
	private int age = 0;
	
	/**
	 * constructor med parametrarna name och age.
	 * @param name: String, inmatning från main-metoden.
	 * @param age: int, inmatning från main-metoden.
	 */
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// getters...
	/**
	 * @return name 
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return age 
	 */
	public int getAge() {
		return age;
	}

	// ...och setters.
	/**
	 * @param name inmatad String från main
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param age inmatad int från main
	 */
	public void setAge(int age) {
		this.age = age;
	} 
}
