package Main.Unterricht.TicTacToe.Graphics;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Main.Unterricht.TicTacToe.Utils.Constants;
import Main.Unterricht.TicTacToe.Utils.Logger;
import Main.Unterricht.TicTacToe.Utils.Variables;

public class GraphicsMain implements Runnable {

	public void run() {
		
		Logger.log("TicTacToe > Graphics >", "GraphicsMainThread was started.");
		
		// Initialize graphics objects
		Variables.MainWindow = new MainWindow("Tic Tac Toe", Variables.MainWindowWidth, Variables.MainWindowHeight, false, Constants.PrimaryColor);
		Variables.MainPanel = new JPanel();
		Variables.ChatPanel = new JPanel();
		Variables.ChatTextArea = new JTextArea("- Chat -");
		Variables.ChatTextField = new JTextField("Write something ...");
		
		// Add things to the Window
		Variables.MainWindow.add(Variables.MainPanel, BorderLayout.CENTER);
		Variables.MainWindow.add(Variables.ChatPanel, BorderLayout.LINE_END);
		
		// At the end make the window visible
		Variables.MainWindow.setVisible(true);
		
		Logger.log("TicTacToe > Graphics >", "GraphicsMainThread has done it's job.");
		
	}
	
	// This will refresh the displayed graphics
	public static void repaint () {
		
	}
	
}
