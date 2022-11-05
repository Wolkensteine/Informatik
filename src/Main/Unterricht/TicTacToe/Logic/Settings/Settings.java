package Main.Unterricht.TicTacToe.Logic.Settings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Main.Unterricht.TicTacToe.Utils.Logger;

public class Settings {

	public static void load() {

		Logger.log("Main > Settings", "Loading settings ...");
		
		try {
			File myObj = new File("main.cfg");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
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

		switch (input.split(": ")[0]) {
		case "": {
			
		}
		default:
			Logger.log("Main > Settings > update", "Unexpected value: " + input.split(": ")[0]);
			throw new IllegalArgumentException("Unexpected value: " + input.split(": ")[0]);
		}

	}

}
