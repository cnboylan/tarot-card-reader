package com.techelevator.tarotdeck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TarotDeck {
	
	private List<TarotCard> fullDeck = new ArrayList<TarotCard>();
	private Random rand = new Random();
	
	public TarotDeck() {
		
		String[] suits = {"Cups", "Pentacles", "Swords", "Wands"};
		String[] minorNums = {"King", "Queen", "Knight", "Page", "10", "9", "8",
								"7", "6", "5", "4", "3", "2", "Ace"};
		String[] majorNums = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI",
								"XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI"};
		String[] names = {"The Fool", "The Magician", "The High Priestess", "The Empress", "The Emperor",
								"The Hierophant", "The Lovers", "The Chariot", "Justice", "The Hermit", 
								"Wheel of Fortune", "Strength", "The Hanged Man", "Death", "Temperance",
								"The Devil", "The Tower", "The Star", "The Moon", "The Sun", "Judgment",
								"The World"};
		
		for (int i = 0; i < majorNums.length; i++) {
			TarotCard newCard = new MajorArcana(majorNums[i], names[i]);
			fullDeck.add(newCard);
		}
		
		for (String suit : suits) {
			
			for (String num : minorNums) {
				TarotCard newCard = new MinorArcana(num, suit);
				fullDeck.add(newCard);
			}
		}
	}
	
	public void flip() {
		for (TarotCard card : fullDeck) {
			card.flip();
		}
	}
	
	public void shuffle() {
		int shuffles = 0;
		while (shuffles == 0)
			shuffles = rand.nextInt(10);
		
		for (int i = 0; i < shuffles; i++)
			Collections.shuffle(fullDeck);
	}
	
	public void draw(int index) {
		for (int i = 0; i < index; i++) {
			TarotCard drawnCard = fullDeck.get(i);
			boolean direction = rand.nextBoolean();
			drawnCard.setReversed(direction);
			drawnCard.flip();
			System.out.println(" " + drawnCard.toString());
		}
	}
	
	@Override
	public String toString() {
		this.flip();
		String deckString = "Deck [listOfCards: " + fullDeck + "]";
		this.flip();
		return deckString;
	}

}
