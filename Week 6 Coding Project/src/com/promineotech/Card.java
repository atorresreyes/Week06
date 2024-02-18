package com.promineotech;

public class Card {

	/*
	 * a. Card
	 * 
		 * i. Fields
		 * 
			 * 1. value (contains a value from 2-14 representing cards 2-Ace)
			 * 
			 * 2. name (Two, Three, Five)
			 * 
			 * 3. suit (Clubs, Diamonds, Hearts, Spades)
	 * 
		 * ii. Methods
		 * 
			 * 1. Getters and Setters
			 * 
			 * 2. describe (prints out information about a card)
	 * 
	 */
	
	
	//FIELDS
	 String name;
	 String suit;
	 int value;
	
	
	//CONSTRUCTORS
	Card(String name, String suit, int value) {
		this.name = name; 
		this.suit = suit;
		this.value = value;
	}
	
	
	//METHODS
	public void describe() {
		System.out.println(this.name + " of " + this.suit + ", with a value of " + this.value + ".");
	}
	
	
	//GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	
	public void setName() {
		this.name = name;
	}
	
	public String getSuit() {
		return suit;
	}
	public void setSuit() {
		this.suit = suit;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue() {
		this.value = value;
	}
	
} //end public class
	
