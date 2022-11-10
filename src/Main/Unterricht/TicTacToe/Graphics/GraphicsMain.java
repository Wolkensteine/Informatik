package Main.Unterricht.TicTacToe.Graphics;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Main.Unterricht.TicTacToe.Utils.Constants;
import Main.Unterricht.TicTacToe.Utils.Logger;
import Main.Unterricht.TicTacToe.Utils.Variables;

public class GraphicsMain implements Runnable {

	public void run() {

		Logger.log("TicTacToe > Graphics >", "GraphicsMainThread was started.");

		// Initialize graphics objects
		Variables.MainWindow = new MainWindow("Tic Tac Toe", Variables.MainWindowWidth, Variables.MainWindowHeight,
				false, Constants.PrimaryColor);
		Variables.MainPanel = new JPanel();
		Variables.ChatPanel = new JPanel();
		Variables.ChatTextPanel = new JPanel();
		Variables.ChatTextArea = new JTextArea("- Chat -\nYou can chat with your oponent here.");
		Variables.ChatTextField = new JTextField("Write something ...");

		// Configure sizes
		Variables.ChatPanel.setSize((int) (Variables.MainWindowWidth * 0.2), Variables.MainWindowHeight);
		Variables.ChatPanel.setBackground(Color.RED);
		Variables.ChatTextPanel.setSize(Variables.ChatPanel.getWidth(), Variables.ChatPanel.getHeight() - 200);
		
		Variables.ChatTextPanel.add(Variables.ChatTextArea);
		Variables.ChatTextAreaScrollPane = new JScrollPane(Variables.ChatTextPanel);
		Variables.ChatPanel.add(Variables.ChatTextAreaScrollPane);

		// Adding stuff
		Variables.MainWindow.add(Variables.ChatPanel, BorderLayout.LINE_END);
		Variables.MainWindow.add(Variables.MainPanel, BorderLayout.CENTER);
		
		// At the end make the window visible
		Variables.MainWindow.setVisible(true);

		Logger.log("TicTacToe > Graphics >", "GraphicsMainThread has done it's job.");

	}

	// This will refresh the displayed graphics
	public static void repaint() {

	}

}
