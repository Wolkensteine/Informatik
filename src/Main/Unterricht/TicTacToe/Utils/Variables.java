package Main.Unterricht.TicTacToe.Utils;

// All the imports needed (here is a good place to look, what is used in the project)
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Main.Unterricht.TicTacToe.Graphics.GraphicsMain;

public class Variables {

	// Main GUI Thread
	public static GraphicsMain GraphicsMainThread = new GraphicsMain();
	
	// MainWindow
	public static JFrame MainWindow;
	public static JPanel MainPanel;				// MainPanel for the game and Menu etc
	public static JPanel ChatPanel;				// Panel for the online chat
	public static JTextArea ChatTextArea; 		// TextArea for other messages
	public static JTextField ChatTextField; 	// TextField for inputs
	public static int MainWindowWidth = 1080;
	public static int MainWindowHeight = 720;
	
	// Play-fields with different matrixes
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
