package Main.Unterricht.TicTacToe.Utils;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Main.Unterricht.TicTacToe.Graphics.GraphicsMain;

public class Variables {

	// Main GUI Thread
	public static GraphicsMain GraphicsMainThread = new GraphicsMain();
	
	// MainWindow
	public static JFrame MainWindow;
	public static JPanel MainPanel;
	
	// Play-field
	public static int[] SmallMatrix = {
			0,0,0,
			0,0,0,
			0,0,0};
	
	public static int[] BigMatrix = {
			0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0};
	
}
