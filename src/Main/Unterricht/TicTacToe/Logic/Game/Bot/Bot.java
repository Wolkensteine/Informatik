package Main.Unterricht.TicTacToe.Logic.Game.Bot;

import java.util.Random;

import Main.Unterricht.TicTacToe.Game;
import Main.Unterricht.TicTacToe.Logic.Game.PlayerInteractions.Symbol;
import Main.Unterricht.TicTacToe.Utils.Logger;
import Main.Unterricht.TicTacToe.Utils.Variables;

/*
 * This is the class in which the bot is programmed, which will be your opponent when you are playing
 * offline or just want to practice for yourself
 * */

public class Bot {

	// Needed information
	static int BotDifficulty;
	
	static int NumberOfThings = 0; // Counter for the amount of placed symbols
	
	static int size;
	
	static int place; // This variable says where the bot will place his symbol

	public Bot(int Difficulty) {

		// Save the needed informations internally
		BotDifficulty = Difficulty;

		// Logging is good
		Logger.log("Bot > BotCreation >", "Bot was created.");

	}

	// This method is there for deciding what the bot will do next
	public static void BotMove() {
		
		switch (Game.GameMatrixSize) {
		case 0: {
			size = 9;
			break;
		}
		case 1: {
			size = 81;
			break;
		}
		default: {
			break;
		}
		}
		
		for (int i = 0; i < size; i++) {
			if (Game.Matrix[i] != 0) {
				NumberOfThings++;
			}
		}
		if (NumberOfThings == 0) {
			// Do a random placing
			place = 1 + (int)(Math.random() * (size - 1));
		} else {
			// Do a 'thoughtful'* place
			// *Depending on the BotDifficulty
			switch (BotDifficulty) {
			case 0: {
				break;
			}
			case 1: {
				break;
			}
			case 2: {
				break;
			}
			case 3: {
				break;
			}
			default:
				break;
			}
		}
		
		Symbol.PlaceSymbol(place, 2);
		
	}

}
