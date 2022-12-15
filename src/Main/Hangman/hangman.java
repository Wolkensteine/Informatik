package Main.Hangman;

import java.util.Scanner;

public class hangman {

	public static String Endmessage;
	
	public static Scanner InputScanner = new Scanner(System.in);
	
	public static String Word;
	
	public static void main(String[] args) {
		
		System.out.println("Starting hangman game ...");
		
		System.out.println("Player ome give me a word!");
		
		Word = InputScanner.next();
		
		System.out.println(Word);
		
		while (true) {
			
			if (true) {
				break;
			}
			
		}
		
		System.out.println("Hangman game done. You " + Endmessage);
		
	}

}
