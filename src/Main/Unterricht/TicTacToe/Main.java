package Main.Unterricht.TicTacToe;

import java.awt.EventQueue;

import Main.Unterricht.TicTacToe.Logic.Settings.Settings;
import Main.Unterricht.TicTacToe.Utils.Logger;
import Main.Unterricht.TicTacToe.Utils.SystemInformation;
import Main.Unterricht.TicTacToe.Utils.Variables;

public class Main {

	public static void main(String[] args) {
		
		Logger.log("TicTacToe > Main >", "Starting up ...");

		Settings.load("main.cfg"); // Load the settings
		
		if (Variables.SystemInfo) { 							// Check if system infos should be logged
			SystemInformation.GetSystemInformation();			// This outputs a lot of data about the used system.
		}
		
		EventQueue.invokeLater(Variables.LogicMainThread);		// Start logic thread
		
		EventQueue.invokeLater(Variables.GraphicsMainThread);	// This thread is just for graphics

		Logger.log("TicTacToe > Main >", "Started up.");

	}

}
