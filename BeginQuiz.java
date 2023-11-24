package MiniProject;

import java.util.Scanner;

public class BeginQuiz {
    private static final String YES = "y";
    private static final String NO = "n";

    public void beginTheQuiz(Scanner scanner) {
        UIHelper newUI = new UIHelper();
        newUI.typingText("Are you ready to begin?: Y/N\n", 5);

            String begin = scanner.nextLine().toLowerCase();

            if (begin.equals(YES)) {
                // Continue with the quiz
            } else if (begin.equals(NO)) {
                newUI.typingText("Okay, see you next time!\n", 5);
              
            } else {
                newUI.typingText("Invalid input\n", 5);
                
            }
        
    }
}
