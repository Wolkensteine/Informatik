package Main.Unterricht.TicTacToe.Logic;

import Main.Unterricht.TicTacToe.Logic.Settings.Settings;
import Main.Unterricht.TicTacToe.Utils.Logger;

public class LogicThread implements Runnable {
	
	public void run() {

		Logger.log("Main > Logic", "Logic Thread was called.");
		
		Settings.load();
		
		Logger.log("Main > Logic", "Logic Thread done.");
		
	}

}
