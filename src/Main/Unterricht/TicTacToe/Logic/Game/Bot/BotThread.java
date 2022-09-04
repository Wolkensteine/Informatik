package Main.Unterricht.TicTacToe.Logic.Game.Bot;

import Main.Unterricht.TicTacToe.Utils.Variables;

public class BotThread implements Runnable {

	// This is the thread which is used by the bot to calculate the best thing to do next.
	public void run() {
		
		switch (Variables.BotDifficulty) {
			case 0: {	// Easy
				System.out.println("Bot > Difficulty > Difficulty is set to: EASY");
			}
			case 1: {	// Normal
				System.out.println("Bot > Difficulty > Difficulty is set to: NORMAL");
			}
			case 2: {	// Hard
				System.out.println("Bot > Difficulty > Difficulty is set to: HARD");
			}
			case 3: {	// Impossible
				System.out.println("Bot > Difficulty > Difficulty is set to: IMPOSSIBLE");
			}
			default:
				throw new IllegalArgumentException("Bot > Difficulty > Unexpected value: " + Variables.BotDifficulty);
		}
		
	}

}
