package Main.Unterricht.TicTacToe.Logic.Game.PlayerInteractions;

import Main.Unterricht.TicTacToe.Utils.Variables;

public class Placement {

	public static boolean checkPossible(int place) {
		
		switch (Variables.game.GameMatrixSize) {
		case 0: { // small matrix
			if (place >= 0 && place < 9) {
				if (Variables.game.Matrix[place] == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
		case 1: { // large matrix
			if (place >= 0 && place < 81) {
				if (Variables.game.Matrix[place] == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + Variables.game.GameMatrixSize);
		}
	}
	
	public static boolean isWin() {
		return false;
	}
	public static boolean isTie() {
		return false;
	}
	
	public static void setSymbol(int place, int symbol) {
		Variables.game.Matrix[place] = symbol;
	}
	
	public static boolean place(int location, int symbol) {
		if (checkPossible(location)) {
			setSymbol(location, symbol);
		} else {
			return false;
		}
		if (isWin()) {
			// TODO add graphical stuff that shows game is over
		} else if (isTie()) {
			// TODO add graphical stuff that shows game is over
		}
		return true;
	}
	
}
