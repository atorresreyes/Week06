package com.promineotech;

import java.util.ArrayList;
import java.util.List;


public class Player {
	/*
	 * 
	 * 
	 * c. Player
	 * 
		 * i. Fields
		 * 
			 * 1. hand (List of Card)
			 * 
			 * 2. score (set to 0 in the constructor)
			 * 
			 * 3. name
	 * 
		 * ii. Methods
		 * 
			 * 1. describe (prints out information about the player and calls the describe
			 * method for each card in the Hand List)
			 * 
			 * 2. flip (removes and returns the top card of the Hand)
			 * 
			 * 3. draw (takes a Deck as an argument and calls the draw method on the deck,
			 * adding the returned Card to the hand field)
			 * 
			 * 4. incrementScore (adds 1 to the Player’s score field)
		 * 
	 */
	
	//FIELDS ****************************************************************************
	List<Card> hand = new ArrayList<>(); 
	int score = 0;
	String name = "";
	
	
	
	//METHODS ****************************************************************************
	 // 1. describe (prints out information about the player and calls the describe
			 // method for each card in the Hand List)
	public void describe() {
		System.out.println(name + " Score: " + score);
		for (Card card : this.hand ) {
			card.describe(); //this is the describe method we wrote in our card class	
		}
	}
	
	// 2. flip (removes and returns the top card of the Hand)
	public Card flip() {
		Card playerCard = this.hand.remove(0);//taking top card of the hand (which will be the first card, means index 0)
		return playerCard;
	}
	
	
	//3. draw (takes a Deck as an argument and calls the draw method on the deck,
	 // adding the returned Card to the hand field)
	public void drawACard(Deck gameDeck) { //Deck 
		Card yourCard = gameDeck.draw();
		this.hand.add(yourCard);
	}

	//4. incrementScore (adds 1 to the Player’s score field)
	public void incrementScore() {
		this.score = score + 1;
	}

	
	//GETTERS AND SETTERS *****************************************************************
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getPlayerName() {
		return name;
	}

	public void setPlayerName(String playerName) {
		this.name = playerName;
	}

	
	
} //end public class
