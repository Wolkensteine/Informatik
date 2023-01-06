package Main.Hangman;

import java.util.Scanner;

public class hangman {

	// Define variables
	public static String Endmessage;
	public static Scanner InputScanner = new Scanner(System.in);
	public static String Word;
	public static char[] WordLetters;
	public static char[] DifferentLettersInWord;
	public static char[] TempCharArray; // This is a temporary array to transfer chars between arrays or to add chars to existing array
	public static int LeftTrys = 6;
	public static char LastInput;
	public static char[] LetterPlaceHolders;
	public static char[] GuessedLetters = new char[0];
	
	// Main class
	public static void main(String[] args) {
		
		// First messages
		System.out.println("Starting hangman game ...");
		System.out.println("Player one give me a word!");
		
		// Begin input
		Word = InputScanner.next(); // Get next input and store it
		
		WordLetters = new char[Word.length()]; // Make the letter array as long as the length of the input String
		
		// Begin indexing letters
		DifferentLettersInWord = new char[0];
		
		// Transfer letters to letter array and ...
		// ... get different chars in the word to later check, if they are inputed to find them
		for (int i = 0; i < Word.length(); i++) {
			WordLetters[i] = Word.toLowerCase().charAt(i); // Add letter to letter array
			
			// check for new letter
			if (DifferentLettersInWord.length == 0) {
				DifferentLettersInWord = new char[1];
				DifferentLettersInWord[0] = WordLetters[i];
			} else {
				// Check if the letter is there
				boolean LetterIsThere = false;
				for (int j = 0; j < DifferentLettersInWord.length; j++) {
					if (DifferentLettersInWord[j] == WordLetters[i]) {
						LetterIsThere = true;
						break;
					}
				}
				// If the letter isn't there add it to the array
				if (!LetterIsThere) {
					TempCharArray = new char[DifferentLettersInWord.length + 1];
					for (int j = 0; j < DifferentLettersInWord.length; j++) {
						TempCharArray[j] = DifferentLettersInWord[j];
					}
					TempCharArray[TempCharArray.length - 1] = WordLetters[i];
					DifferentLettersInWord = TempCharArray;
				}
			}
		}
		
		// Create the placeholder array
		LetterPlaceHolders = new char[WordLetters.length];
		
		// fill the array with underscores
		for (int i = 0; i < LetterPlaceHolders.length; i++) {
			LetterPlaceHolders[i] = '_';
		}
		
		// Initial cleanup of the console and output of the placeholder array to begin the game.
		
		// Begin game loop
		while (true) {
			
			/*
			// Check, if loop needs to be broken.
			if () { // Check if you won
				Endmessage = "won! Congratulations!"; // Change the message at the end
				break;
			} else if (LeftTries <= 0) { // Check if you lost
				Endmessage = "lost ... Maybe you'll get it next time"; // Change the message at the end
				break;
			}*/
			
			// Tell the second player to make a guess
			System.out.println("It is your turn player 2. Make a guess.");
			
			// Get the new input as lowercase letter, so every letter works at every position
			LastInput = InputScanner.next().toLowerCase().charAt(0);
			
			// Check if letter was already guessed
			boolean tmpbool = false; // temporary variable, which will be set to true if the letter is already there
			
			for (int i = 0; i < GuessedLetters.length; i++) {
				if (GuessedLetters[i] == LastInput) {
					tmpbool = true;
					break;
				}
			}
			
			// When letter was guessed send message, else proceed with normal procedure 
			if (tmpbool) {
				System.out.println("You already tried this letter.");
			} else {
				// Add new letter to the array of guessed letters, so it can be printed out later
				if (GuessedLetters.length == 0) {
					// There hasn't been any guesses so far. Add it as the first entry
					GuessedLetters = new char[1];
					GuessedLetters[0] = LastInput;
				} else {
					// Add new letter to the guessed letters by using a temporary array with a plus one length in comparison to the already existing array of guessed letters
					for (int i = 0; i < GuessedLetters.length; i++) {
						for (int j = 0; j < GuessedLetters.length; j++) {
							TempCharArray[j] = GuessedLetters[j];
						}
						TempCharArray[TempCharArray.length - 1] = LastInput;
						GuessedLetters = TempCharArray;
					}
				}
				
				for (int i = 0; i < WordLetters.length; i++) {
					if (WordLetters[i] == LastInput) {
						LetterPlaceHolders[i] = LastInput;
					}
				}
			}
			
			
			// create temporary variable for the output of the placeholders and the guessed letters
			String placeholderout = "";
			// transfer the placeholders and guessed letters to the output string with spaces between them
			for (int i = 0; i < LetterPlaceHolders.length; i++) {
				placeholderout += LetterPlaceHolders[i] + " ";
			}
			
			// Output all the things
			System.out.println();
			System.out.println(placeholderout);
			System.out.println();
			
			break; // This is just for building the stuff and test it out
			
		}
		
		System.out.println("Hangman game done. You " + Endmessage);
		
	}

}
