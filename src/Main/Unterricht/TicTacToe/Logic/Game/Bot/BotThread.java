package Main.Unterricht.TicTacToe.Logic.Game.Bot;

import Main.Unterricht.TicTacToe.Utils.Logger;
import Main.Unterricht.TicTacToe.Utils.Variables;

public class BotThread implements Runnable {

	public static Bot CurrentBot;
	
	// This is the thread which is used by the bot to calculate the best thing to do next.
	public void run() {
		
		switch (Variables.BotDifficulty) {
			case 0: {	// Easy
				Logger.log("Bot > Difficulty >", "Difficulty is set to: EASY");
			}
			case 1: {	// Normal
				Logger.log("Bot > Difficulty >", "Difficulty is set to: NORMAL");
			}
			case 2: {	// Hard
				Logger.log("Bot > Difficulty >", "Difficulty is set to: HARD");
			}
			case 3: {	// Impossible
				Logger.log("Bot > Difficulty >", "Difficulty is set to: IMPOSSIBLE");
			}
			default:
				throw new IllegalArgumentException("Bot > Difficulty > Unexpected value: " + Variables.BotDifficulty);
		}
		
	}
	
	public void Bot(int Difficulty, int MatrixSize) {
		
		switch (MatrixSize) {
			case 1: {
				Logger.log("Bot > MatrixSize >", "Size is set to: Small");
				CurrentBot = new Bot(Difficulty, MatrixSize);
			}
			case 2: {
				Logger.log("Bot > MatrixSize >", "Size is set to: Big");
			}
			default:
				throw new IllegalArgumentException("Bot > MatrixSize > Unexpected value: " + MatrixSize);
		}
		
	}

}
