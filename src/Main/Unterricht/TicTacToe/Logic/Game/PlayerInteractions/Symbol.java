package Main.Unterricht.TicTacToe.Logic.Game.PlayerInteractions;

import Main.Unterricht.TicTacToe.Utils.Variables;

public class Symbol {
	
	// will add symbol to matrix and return true or returns false and does nothing
	// 0 = none
	// 1 = X
	// 2 = O
	// numbering of positions starts with 0
	// MatrixSize 0 = small 1 = big
	public boolean PlaceSymbol(int position, int symbol, int MatrixSize) {
		if (MatrixSize == 0) {																		// Check for selected size
			if (position >= 0 && position < 9) {													// Check for valid position
				if (Variables.SmallMatrix[position] == 0 && ( symbol == 1 || symbol == 2 ) ) {		// Check for valid placement and valid symbol
					Variables.SmallMatrix[position] = symbol;										// Set symbol
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else if(MatrixSize == 1) {																// Check for selected size
			if (position >= 0 && position < 81) {													// Check for valid position
				if (Variables.SmallMatrix[position] == 0 && ( symbol == 1 || symbol == 2 ) ) {		// Check for valid placement and valid symbol
					Variables.SmallMatrix[position] = symbol;										// Set symbol
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
}
