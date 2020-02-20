package com.techelevator.tarotdeck;

public abstract class TarotCard {
	
//	private String number;
//	private String suit;
	protected boolean faceUp = false;
	protected boolean reversed = false;
	
	public void flip() {
		this.faceUp = !this.faceUp;
	}
	
	public void setReversed(boolean direction) {
		reversed = direction;
	}
	
	@Override
	public abstract String toString();

	public boolean isFaceUp() {
		return faceUp;
	}
	
	public String isReversed() {
		if (reversed == true)
			return " R";
		
		return "";
	}

}
