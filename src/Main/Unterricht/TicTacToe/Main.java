package Main.Unterricht.TicTacToe;

import java.awt.EventQueue;

import Main.Unterricht.TicTacToe.Utils.Logger;
import Main.Unterricht.TicTacToe.Utils.SystemInformation;
import Main.Unterricht.TicTacToe.Utils.Variables;

public class Main {

	public static void main(String[] args) {

		Logger.log("TicTacToe > Main >", "Starting up ...");

		SystemInformation.GetSystemInformation();

		EventQueue.invokeLater(Variables.GraphicsMainThread);

		Logger.log("TicTacToe > Main >", "Started up.");

	}

}
