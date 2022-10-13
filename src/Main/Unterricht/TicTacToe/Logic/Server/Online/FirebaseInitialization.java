package Main.Unterricht.TicTacToe.Logic.Server.Online;

import java.io.FileInputStream;

import org.springframwork.stereotype.Service;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOption;

@Service
public class FirebaseInitialization {
	FileInputStream serviceAccount =
			  new FileInputStream("./ServiceAcount.json");

	FirebaseOptions options = new FirebaseOptions.Builder()
	  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
	  .setDatabaseUrl("https://tik-tak-toe-d7352.firebaseio.com")
	  .build();

	FirebaseApp.initializeApp(options);
}
