package MiniProject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LoginToQuiz {
    private static final String RESULTS_FILE_NAME = "results.csv";

    public String loginToTheQuiz() {
        UIHelper newUI = new UIHelper();

        Scanner scanner = new Scanner(System.in);
            newUI.typingText("Please enter your username: \n", 10);
            String username = scanner.nextLine();

            File resultsFile = new File(RESULTS_FILE_NAME);

            TextReader scoreReaderTest = new TextReader();
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
                    newUI.typingText("Welcome Back " + username + " you have logged in.\n", 10);
                } else {
                    newUI.typingText("Welcome " + username + " you have created a new account.\n", 10);
                }

                playerNames.add(username);
            } catch (IOException e) {
                e.printStackTrace(); 
            }

            return username;
        
    }
}
