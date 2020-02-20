package com.techelevator.tarotreading;

import java.util.Scanner;

import com.techelevator.tarotdeck.TarotDeck;

public class TarotReading {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Would you like a tarot card reading? (Y/N) ");
		String startReading = myScanner.nextLine();
		
		if (!startReading.equalsIgnoreCase("y")) {
			myScanner.close();
			System.out.println("K bye!");
			return;
		}
		
		System.out.println("How many cards would you like to draw? ");
		int numberCards = myScanner.nextInt();
		
		while (numberCards > 10) {
			System.out.println("You may not choose more than 10! It's best to choose 1, 3, or 10.");
			System.out.println("How many cards would you like to draw? ");
			numberCards = myScanner.nextInt();
		}
		
		myScanner.close();
		
		TarotDeck myTarotDeck = new TarotDeck();
		myTarotDeck.shuffle();
		
		System.out.println("Your cards:");
		
		myTarotDeck.draw(numberCards);
			
		
		System.out.println("I hope you enjoyed your reading, goodbye!");
		return;

	}

}
