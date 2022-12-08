package Main.Unterricht.TicTacToe.Logic;

import Main.Unterricht.TicTacToe.Utils.Logger;

public class LogicThread implements Runnable {
	
	public void run() {

		Logger.log("Main > Logic", "Logic Thread was called.");
		
		// Setup listeners and other logic stuff
		
		Logger.log("Main > Logic", "Logic Thread done.");
		
	}

}
