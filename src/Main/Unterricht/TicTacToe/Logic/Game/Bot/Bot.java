package Main.Unterricht.TicTacToe.Logic.Game.Bot;

import Main.Unterricht.TicTacToe.Utils.Logger;
import Main.Unterricht.TicTacToe.Utils.Variables;

/*
 * This is the class in which the bot is programmed, which will be your opponent when you are playing
 * offline or just want to practice for yourself
 * */

public class Bot {

	// Needed information
	static int BotDifficulty;
	static int BotMatrixSize;
	
	static int NumberOfThings; // Counter for the amount of placed symbols

	public Bot(int Difficulty, int MatrixSize) {

		// Save the needed informations internally
		BotDifficulty = Difficulty;
		BotMatrixSize = MatrixSize;

		// Logging is good
		Logger.log("Bot > BotCreation >", "Bot was created.");

	}

	// This method is there for deciding what the bot will do next
	public static int BotMove() {
		switch (BotDifficulty) { // Decides how hard the bot should play
		case 0: {
			switch (BotMatrixSize) {
			case 0: {
				NumberOfThings = 0;
				for (int i = 0; i < 9; i++) {
					if (Variables.SmallMatrix[i] != 0) {
						NumberOfThings++;
					}
				}
				if (NumberOfThings == 0) {
					// Do a random placing
				} else {
					// Do a thoughtful place
				}
			}
			case 1: {
				for (int i = 0; i < 81; i++) {

				}
			}
			default:
				throw new IllegalArgumentException("Bot > BotMove > MatrixSize > Unexpected value: " + BotMatrixSize);
			}
		}
		case 1: {
			switch (BotMatrixSize) {
			case 0: {
				for (int i = 0; i < 9; i++) {

				}
			}
			case 1: {
				for (int i = 0; i < 81; i++) {

				}
			}
			default:
				throw new IllegalArgumentException("Bot > BotMove > MatrixSize > Unexpected value: " + BotMatrixSize);
			}
		}
		case 2: {
			switch (BotMatrixSize) {
			case 0: {
				for (int i = 0; i < 9; i++) {

				}
			}
			case 1: {
				for (int i = 0; i < 81; i++) {

				}
			}
			default:
				throw new IllegalArgumentException("Bot > BotMove > MatrixSize > Unexpected value: " + BotMatrixSize);
			}
		}
		case 3: {
			switch (BotMatrixSize) {
			case 0: {
				for (int i = 0; i < 9; i++) {

				}
			}
			case 1: {
				for (int i = 0; i < 81; i++) {

				}
			}
			default:
				throw new IllegalArgumentException("Bot > BotMove > MatrixSize > Unexpected value: " + BotMatrixSize);
			}
		}
		default:
			throw new IllegalArgumentException("Bot > BotMove > Difficulty > Unexpected value: " + BotDifficulty);
		}
	}

}
