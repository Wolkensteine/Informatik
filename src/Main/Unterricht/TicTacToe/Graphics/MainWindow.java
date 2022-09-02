package Main.Unterricht.TicTacToe.Graphics;

import java.awt.Color;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainWindow extends JFrame {
	
	// Just a small class to make a window with attributes directly in the initialization
	public MainWindow (String name, int width, int height, boolean visibleOnStartup, Color BackgroundColor) {
		this.setName(name);
		this.setSize(width, height);
		this.getContentPane().setBackground(BackgroundColor);
		this.setVisible(visibleOnStartup);
	}
	
}
