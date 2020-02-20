package com.techelevator.tarotdeck;

public class MajorArcana extends TarotCard {

	private String number;
	private String name;
	
	public MajorArcana(String number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public String toString() {
		return number + " " + name + isReversed();
	}
}
