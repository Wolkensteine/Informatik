package Main.Unterricht.TicTacToe.Graphics;

import Main.Unterricht.TicTacToe.Utils.Variables;

public class GraphicsMain implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Graphics > Main > GraphicsMain thread was started.");
		
		Variables.MainWindow = new MainWindow("Tic Tac Toe", 1080, 720, false);
		
		System.out.println("Graphics > Main > GraphicsMain has done it's job.");
		
	}

}
