package Main.Hangman;

import java.util.Scanner;

public class hangman {

	// Set variables
	public static String Endmessage;
	public static Scanner InputScanner = new Scanner(System.in);
	public static String Word;
	public static char[] WordLetters;
	public static char[] DifferentLettersInWord;
	
	public static void main(String[] args) {
		
		System.out.println("Starting hangman game ...");
		
		System.out.println("Player ome give me a word!");
		
		Word = InputScanner.next(); // Get next input and store it
		
		WordLetters = new char[Word.length()]; // Make the letter array as long as the length of the input String
		
		// Get different chars in the word to later check, if they are inputed to find them
		for (int i = 0; i < Word.length(); i++) {
			
		}
		
		// Begin game
		while (true) {
			
			if () { // Check if you won
				Endmessage = "won! Congratulations!"; // Change the message at the end
				break;
			} else if () { // Check if you lost
				Endmessage = "lost ... Maybe you'll get it next time"; // Change the message at the end
				break;
			} else { // Do normal
				
			}
			
		}
		
		System.out.println("Hangman game done. You " + Endmessage);
		
	}

}
