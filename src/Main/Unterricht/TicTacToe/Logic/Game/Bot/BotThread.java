package Main.Unterricht.TicTacToe.Logic.Game.Bot;

import Main.Unterricht.TicTacToe.Utils.Logger;
import Main.Unterricht.TicTacToe.Utils.Variables;

public class BotThread implements Runnable {

	public static Bot CurrentBot;

	// This is the thread which is used by the bot to calculate the best thing to do
	// next.
	public void run() {

		switch (Variables.BotDifficulty) {
		case 0: { // Easy
			Logger.log("Bot > Difficulty >", "Difficulty is set to: EASY");
			break;
		}
		case 1: { // Normal
			Logger.log("Bot > Difficulty >", "Difficulty is set to: NORMAL");
			break;
		}
		case 2: { // Hard
			Logger.log("Bot > Difficulty >", "Difficulty is set to: HARD");
			break;
		}
		case 3: { // Impossible
			Logger.log("Bot > Difficulty >", "Difficulty is set to: IMPOSSIBLE");
			break;
		}
		default:
			break;
		}

		Logger.log("Bot > MatrixSize >", "Creating bot ...");
		CurrentBot = new Bot(Variables.BotDifficulty);
		
	}

}
