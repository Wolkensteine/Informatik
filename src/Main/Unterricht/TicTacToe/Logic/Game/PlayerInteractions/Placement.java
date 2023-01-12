package Main.Unterricht.TicTacToe.Logic.Game.PlayerInteractions;

import Main.Unterricht.TicTacToe.Utils.Logger;
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
			Logger.log("Main > Logic > Placement > checkPossible()", "Unexpected value: " + Variables.game.GameMatrixSize);
			throw new IllegalArgumentException("Unexpected value: " + Variables.game.GameMatrixSize);
		}
	}
	
	public static boolean isWin(int location, int symbol) {
		switch (Variables.game.GameMatrixSize) {
		case 0: { // small matrix
			if (Variables.game.numberOfMoves < 5) {
				return false;
			}
			switch (location) {
			case 0:
				
				break;
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				
				break;
			default:
				break;
			}
			break;
		}
		case 1: { // large matrix
			if (Variables.game.numberOfMoves < 15) {
				return false;
			}
			break;
		}
		default:
			Logger.log("Main > Logic > Placement > isWin()", "Unexpected value: " + Variables.game.GameMatrixSize);
			throw new IllegalArgumentException("Unexpected value: " + Variables.game.GameMatrixSize);
		}
		return false;
	}
	public static boolean isTie() {
		switch (Variables.game.GameMatrixSize) {
		case 0: { // small matrix
			if (Variables.game.numberOfMoves == 9) {
				return true;
			} else {
				return false;
			}
		}
		case 1: { // large matrix
			if (Variables.game.numberOfMoves == 81) {
				return true;
			} else {
				return false;
			}
		}
		default:
			Logger.log("Main > Logic > Placement > isTie()", "Unexpected value: " + Variables.game.GameMatrixSize);
			throw new IllegalArgumentException("Unexpected value: " + Variables.game.GameMatrixSize);
		}
	}
	
	public static void setSymbol(int place, int symbol) {
		Variables.game.Matrix[place] = symbol;
		Variables.game.numberOfMoves++;
	}
	
	public static boolean place(int location, int symbol) {
		Logger.log("Main > Logic > Placement > place()", "Trying to set symbol " + symbol + " at position " + location);
		if (checkPossible(location)) {
			setSymbol(location, symbol);
		} else {
			return false;
		}
		if (isWin(location, symbol)) {
			Logger.log("Main > Logic > GameStatus", "Win");
			// TODO add graphical stuff that shows game is over
		} else if (isTie()) {
			Logger.log("Main > Logic > GameStatus", "Tie");
			// TODO add graphical stuff that shows game is over
		}
		return true;
	}
	
}
