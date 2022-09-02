package Main.Unterricht.TicTacToe.Graphics;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainWindow extends JFrame {
	
	public MainWindow (String name, int width, int height, boolean visibleOnStartup) {
		
		this.setName(name);
		
		this.setSize(width, height);
		
		this.setVisible(visibleOnStartup);
		
	}
	
}
