package Main.Unterricht.TicTacToe.Logic.Game.Bot;

import Main.Unterricht.TicTacToe.Utils.Logger;

public class Bot {

	int BotDifficulty;
	int BotMatrixSize;
	
	public Bot(int Difficulty, int MatrixSize) {
		
		BotDifficulty = Difficulty;
		BotMatrixSize = MatrixSize;
		
		Logger.log("Bot > BotCreation >", "Bot was created.");
		
	}
	
	public static int BotMove() {
		return 1;	// Returns the place where the bot wants to place its symbol
	}
	
}
