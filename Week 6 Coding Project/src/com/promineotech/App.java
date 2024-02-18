package com.promineotech;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 * WAR GAME: EACH PERSON PICKS A CARD AND FLIP IT OVER
	 * PLAYER WITH HIGHEST NUMBER CARD GETS A POINT
	 * GAME ENDS WHEN THERE'S NO MORE CARDS
	 * WHOEVER HAS THE MOST POINTS AT THE END WINS
	 * 
	 * Setting Up
	 * 1. create deck
	 * 2. shuffle deck
	 * 3. split cards into each of the players hands
	 * * deck should now be empty! 
	 * 
	 * Playing
	 * 1. each player Removes/Flips top card from their deck  
	 * 2. these two cards are then compared
	 * 3. highest card gets one point
	 * * if tie, neither player gets a point
	 * 
	 * Game Over
	 * * Game is over once all 52 cards have been flipped. 
	 * * Whoever has the highest score wins (or tie).
	 * 
	 * You don’t give the card to the other player for this assignment. You will keep a point tally and when a player wins theirs goes up by one. That way we don’t potentially go 1500 hands.
	 */
		
	
	//Creating players	
	Player playerOne = new Player();
	Player playerTwo = new Player();
	
	playerOne.name = "Player One";
	playerTwo.name = "Player Two";
	
	
	playerOne.describe();
	playerTwo.describe();

	
	//Creating deck
    Deck gameDeck = new Deck();
    
    
    gameDeck.shuffle();
    
    //TESTING SHUFFLE
	gameDeck.describe();
	//
    
   //Distribute cards to hands
    for (int i = 0; i < 52; i++) {
	    	if (i % 2 != 0) {
	    		playerOne.drawACard(gameDeck);
	    	}
    		if (i % 2 == 0) {
    			playerTwo.drawACard(gameDeck);
    		}
    }
    
    // TESTING
    System.out.println("Player One Hand");
    playerOne.describe();
    System.out.println("Player Two Hand");
    playerTwo.describe();
    //
    
    
    //Playing game
    for (int i = 0; i < 26; i++) {
    		awardPoints(playerOne, playerTwo);
    }
    
    
    //Check who won
    if (playerOne.score > playerTwo.score) {
		System.out.println(playerOne.name + " Score: " + playerOne.score);
		System.out.println(playerTwo.name + " Score: " + playerTwo.score);
    		System.out.println(playerOne.name + " wins! Good Game.");
    } else if (playerOne.score < playerTwo.score) {
		System.out.println(playerOne.name + " Score: " + playerOne.score);
		System.out.println(playerTwo.name + " Score: " + playerTwo.score);
    		System.out.println(playerTwo.name + " wins! Good Game.");
    } else {
		System.out.println(playerOne.name + " Score: " + playerOne.score);
		System.out.println(playerTwo.name + " Score: " + playerTwo.score);
    		System.out.println("It's a draw! Good Game.");
    }
    

		
	} // end main args
	
	//METHODS
	public static void awardPoints(Player playerOne, Player playerTwo) {
		Card playerOneCard = playerOne.flip();
		Card playerTwoCard = playerTwo.flip();
		if (playerOneCard.value > playerTwoCard.value) {
			playerOne.incrementScore();
			System.out.println("Point for Player One!");
		} else if (playerOneCard.value < playerTwoCard.value) {
			playerTwo.incrementScore();
			System.out.println("Point for Player Two!");
		} else {
			System.out.println("Tie! No Points Awarded.");
		}
	}
	

} // end public class
