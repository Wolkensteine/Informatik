package Main.Unterricht.TicTacToe.Logic.Chat;

import Main.Unterricht.TicTacToe.Utils.Variables;

public class Chat {

	// Will format the chat
	public void FormatChat (String OpponentPlayerName) {
		
		Variables.ChatTextArea.setText("Chat with: " + OpponentPlayerName);
		
	}
	
	// Will clear chat
	public void ChatClear () {
		
		Variables.ChatTextArea.setText("");
		
	}
	
	public void HideChat () {
		
	}
	
	// Will add message from opponent to chat
	public void addReceivedMessage (String Message) {
		
		Variables.ChatTextArea.setText(Variables.ChatTextArea.getText() + Message);
		
	}
	
	// Will add own send message to chat
	public void addSendMessage (String Message) {
		
		Variables.ChatTextArea.setText(Variables.ChatTextArea.getText() + Message);
		
	}

}
