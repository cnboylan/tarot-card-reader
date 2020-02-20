package com.techelevator.tarotdeck;

public class MinorArcana extends TarotCard {

	private String number;
	private String suit;
	
	public MinorArcana(String number, String suit) {
		this.number = number;
		this.suit = suit;
	}
	
	public String toString() {
		return number + " of " + suit + isReversed();
	}
}
