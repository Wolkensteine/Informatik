package Main.Unterricht.TicTacToe.Logic.Game.PlayerInteractions;

import Main.Unterricht.TicTacToe.Utils.Variables;

public class Placement {

	public static boolean checkPossible(int place) {
		
		switch (Variables.game.GameMatrixSize) {
		case 0: { // small matrix
			if (place >= 0 && place < 9) {
				
			} else {
				return false;
			}
			break;
		}
		case 1: { // large matrix
			if (place >= 0 && place < 81) {
				
			} else {
				return false;
			}
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + Variables.game.GameMatrixSize);
		}
		
		return false;
		
	}
	
	public static boolean isWin() {
		return false;
	}
	
	public static void setSymbol(int place, int symbol) {
		
	}
	
	public static boolean place(int location, int symbol) {
		if (checkPossible(location)) {
			
		} else {
			return false;
		}
		
		return true;
	}
	
}
