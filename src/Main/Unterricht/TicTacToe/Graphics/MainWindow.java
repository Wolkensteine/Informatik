package Main.Unterricht.TicTacToe.Graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JFrame;

import Main.Unterricht.TicTacToe.Utils.Logger;
import Main.Unterricht.TicTacToe.Utils.Variables;

@SuppressWarnings("serial")
public class MainWindow extends JFrame {

	// Just a small class to make a window with attributes directly in the
	// initialization
	public MainWindow(String name, int width, int height, boolean visibleOnStartup, Color BackgroundColor) {
		Logger.log("TicTacToe > Graphics >", "Creating MainWindow with the following values: name = " + name + "; width = " + width + "; height = " + height + "; visibleOnStartup = " + visibleOnStartup + "; BackgroundColor = " + BackgroundColor);
		
		// Change attributes of mainframe
		this.setName(name);
		this.setSize(width, height);
		this.getContentPane().setBackground(BackgroundColor);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(visibleOnStartup);
		this.setLayout(new BorderLayout());
		this.setResizable(Variables.Config_Window_Resizable);
		
		// Add a component listener
		getContentPane().addComponentListener(new ComponentListener() {
			public void componentShown(ComponentEvent e) {
				// TODO start refreshing Image again
			}
			public void componentResized(ComponentEvent e) {
				// Listen for resize and change width/height values, after that repaint
				Variables.MainWindowWidth = Variables.MainWindow.getWidth();
				Variables.MainWindowHeight = Variables.MainWindow.getHeight();
				GraphicsMain.repaint();
			}
			public void componentMoved(ComponentEvent e) {
				// TODO Check if parts of the window are outside of the visual area and bring it back into visible area
			}
			public void componentHidden(ComponentEvent e) {
				// TODO stop refreshing Image to increase overall performance
			}
		});
	}

}
