package Main.Unterricht.TicTacToe.Utils;

// All the imports needed (here is a good place to look, what is used in the project)
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Main.Unterricht.TicTacToe.Game;
import Main.Unterricht.TicTacToe.Graphics.GraphicsMain;
import Main.Unterricht.TicTacToe.Logic.LogicThread;

// !IMPORTANT Please DO NOT autoformat this file!

public class Variables {

	public static final Runnable LogicMainThread = new LogicThread();

	// Main GUI Thread
	public static GraphicsMain GraphicsMainThread = new GraphicsMain();
	
	// MainWindow
	public static JFrame MainWindow;
	public static JPanel MainPanel;						// MainPanel for the game and Menu etc
	public static JPanel ChatPanel;						// Panel for the online chat region
	public static JPanel ChatTextPanel;					// Holder for the Text of the chat for scrollpane
	public static JTextArea ChatTextArea; 				// TextArea for other messages
	public static JTextField ChatTextField; 			// TextField for inputs
	public static JScrollPane ChatTextAreaScrollPane;	// This is there so you can scroll through your chat messages
	public static int MainWindowWidth = 1080;
	public static int MainWindowHeight = 720;
	
	// Bot settings
	public static int BotDifficulty;
	
	public static Game game; // game instance (this will be modified everytime a game starts -> This should happen by an interaction listener)
	
}
