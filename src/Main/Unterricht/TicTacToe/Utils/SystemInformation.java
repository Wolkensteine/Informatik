package Main.Unterricht.TicTacToe.Utils;

public class SystemInformation {

	public static void GetSystemInformation () {
		
		Logger.log("SystemInformation", "Found properties:" + System.getProperties() + "\n" + System.getenv());
		
	}
	
}
