package MiniProject;

import java.util.Scanner;

public class BeginQuiz {
	public void BeginQuiz() {
		UIHelper newUI = new UIHelper();
		newUI.typingText("Are you ready to begin?: Y/N\n", 5);
		Scanner scanner = new Scanner(System.in);
		String begin = scanner.nextLine();

		begin = begin.toLowerCase();
		if (begin.equals("y")) {

		} else if (begin.equals("n")) {

			newUI.typingText("okay see you next time!\n", 5);
			System.exit(0);
		} else {
			newUI.typingText("Invalid input\n", 5);
			System.exit(0);
		}
	}

}
