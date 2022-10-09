package Main.Unterricht.TicTacToe;

import Main.Unterricht.TicTacToe.Utils.Constants;
import Main.Unterricht.TicTacToe.Utils.Logger;

public class Game {

	public static int GameMatrixSize; // 0 = small 1 = big
	
	public static int[] Matrix;
	
	public static String MyID;
	
	public static String OpponentID;
	
	public Game(int MatrixSize, String SendMyID, String SendOpponentID) {
		
		Logger.log("Main > Game", "Creating new game ...");
		
		switch (MatrixSize) {
		case 0: {
			GameMatrixSize = 0;
			Matrix = Constants.SmallMatrix;
			break;
		}
		case 1: {
			GameMatrixSize = 1;
			Matrix = Constants.BigMatrix;
			break;
		}
		default:
			Logger.log("Main > Game", "MatrixSize was not recognized.");
			throw new IllegalArgumentException("Unexpected value: " + MatrixSize);
		}
		
		Logger.log("Main > Game", "Matrix size: " + MatrixSize);
		
		MyID = SendMyID;
		
		OpponentID = SendOpponentID;
		
	}
	
	public static void start() {
		
	}

}
