package Main.Unterricht.TicTacToe;

import java.awt.EventQueue;

import Main.Unterricht.TicTacToe.Graphics.GraphicsMain;
import Main.Unterricht.TicTacToe.Utils.Variables;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("TicTacToe > Main > Starting up ...");
		
		EventQueue.invokeLater(Variables.GraphicsMainThread);
		
		System.out.println("TicTacToe > Main > Started up.");
		
	}

}
