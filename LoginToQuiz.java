package MiniProject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LoginToQuiz {

	public String loginToTheQuiz(Scanner scanner) {
		UIHelper newUI = new UIHelper();

		newUI.typingText("Please enter your username: \n", newUI.GetTEXT_SLEEP_SLOW());
		String username = scanner.nextLine();

		TextHandler scoreReaderTest = new TextHandler();
		File resultsFile = scoreReaderTest.ReturnFile();
		ArrayList<String> playerArray = scoreReaderTest.readResults();
		ArrayList<String> playerNames = new ArrayList<>();

		try {
			if (!resultsFile.exists()) {
				resultsFile.createNewFile();
			}

			for (String playerInfo : playerArray) {
				String[] values = playerInfo.split(",");
				playerNames.add(values[0]);
			}

			if (playerNames.contains(username)) {
				newUI.typingText("Welcome Back " + username +
						" you have logged in.\n", newUI.GetTEXT_SLEEP_SLOW());
			} else {
				newUI.typingText("Welcome " + username + 
						" you have created a new account.\n", newUI.GetTEXT_SLEEP_SLOW());
			}

			playerNames.add(username);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return username;

	}
}
