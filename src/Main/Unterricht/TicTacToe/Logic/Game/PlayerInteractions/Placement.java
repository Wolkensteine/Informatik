package Main.Unterricht.TicTacToe.Logic.Game.PlayerInteractions;

import Main.Unterricht.TicTacToe.Utils.Variables;

public class Placement {

	public static boolean checkPossible(int place) {
		
		switch (Variables.game.GameMatrixSize) {
		case 0: {
			
			break;
		}
		case 1: {
			
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + Variables.game.GameMatrixSize);
		}
		
		return false;
		
	}
	
}
