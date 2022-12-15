package Main.Unterricht.TicTacToe.Logic.Settings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Main.Unterricht.TicTacToe.Utils.Logger;
import Main.Unterricht.TicTacToe.Utils.Variables;

public class Settings {

	public static void load() {

		Logger.log("Main > Settings", "Loading settings ...");
		
		// Try to load file
		try {
			File myObj = new File("Config/main.cfg");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) { // Update the configs one line after another
				String data = myReader.nextLine();
				Logger.log("Main > Settings > main.cfg", data);
				update(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			Logger.log("Main > Settings > ERROR", "File main.cfg was not found!");
			e.printStackTrace();
		}

	}

	public static void update(String input) {
		
		// Check for config in line and change it correspondingly 
		switch (input.split(": ")[0].toLowerCase()) {
		// Change if the window is resizeable or not
		case "rezise": {
			if (input.split(": ")[1].toLowerCase().startsWith("true")) {
				Logger.log("Main > Settings > Resizable", "True");
				Variables.Config_Window_Resizable = true;
			} else if (input.split(": ")[1].toLowerCase().startsWith("false")) {
				Logger.log("Main > Settings > Resizable", "False");
				Variables.Config_Window_Resizable = false;
			}
			break;
		}
		// Change default width
		case "width": {
			Variables.MainWindowWidth = Integer.parseInt(input.split(": ")[1]);
			Logger.log("Main > Settings > Window Width", Integer.toString(Variables.MainWindowWidth));
			break;
		}
		// Change default height
		case "height": {
			Variables.MainWindowHeight = Integer.parseInt(input.split(": ")[1]);
			Logger.log("Main > Settings > Window height", Integer.toString(Variables.MainWindowHeight));
			break;
		}
		default:
			Logger.log("Main > Settings > update", "Unexpected value: " + input.split(": ")[0]);
			throw new IllegalArgumentException("Unexpected value: " + input.split(": ")[0]);
		}

	}

}
