package com.promineotech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {

	
	/*
	 * b. Deck
	 * 
		 * i. Fields
		 * 
		 	* 1. cards (List of Card)
		 * 
		 * ii. Methods
		 * 
			 * 1. shuffle (randomizes the order of the cards)
			 * 
			 * 2. draw (removes and returns the top card of the Cards field)
			 * 
			 * 3. In the constructor, when a new Deck is instantiated, the Cards field
			 * should be populated with the standard 52 cards.
	 */
	
	
	//FIELDS
	List<Card> deckOfCards = new ArrayList<Card>(); 
	
	
	//CONSTRUCTORS
	Deck() { 
		String[] suits = {"Clubs" , "Diamonds" , "Hearts" , "Spades"}; 
		String[] names = {"Two" , "Three" , "Four" , "Five" , "Six" , "Seven" , "Eight" , "Nine" , "Ten" , "Jack" , "Queen" , "King" , "Ace"}; 
		
	
		for (String suit : suits) {
			int cardValue = 2; //tie the value to each card
			for (String name : names ) {
				Card card = new Card(name, suit, cardValue); // now each card will have all of these
				this.deckOfCards.add(card);
				cardValue++;
			}//end second for loop for names
		}//end first for loop for suits
	}//end deck() constructor



	
	
	//METHODS
	public void describe() {
		for (Card card : this.deckOfCards ) {
			card.describe(); //this is the describe method we wrote in our card class
		}
	}
	public void shuffle() {
		Collections.shuffle(this.deckOfCards); 
		//will place our elements in the list in a random order
	}
	
	
	public Card draw() { //our return type will be a Card bc we will be needing to take that card and put it somewhere else 
		Card yourCard = this.deckOfCards.remove(0);//taking top card of the deck (which will be the first card, means index 0)
		return yourCard;
	}
	
	
	//GETTERS AND SETTERS
	public List<Card> getDeckOfCards() {
		return deckOfCards;
	}


	public void setDeckOfCards(List<Card> deckOfCards) {
		this.deckOfCards = deckOfCards;
	}	
	
	
	
	
	
	
} // end public class
