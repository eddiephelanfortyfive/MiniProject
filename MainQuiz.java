package MiniProject;

import java.util.Scanner;

public class MainQuiz {
	public static void main(String[] args) {
		int score = 0;
		Scanner scanner = new Scanner(System.in);

		UIHelper UIHelper = new UIHelper();
		UIHelper.welcome();

		LoginToQuiz newUser = new LoginToQuiz();
		String username = newUser.loginToTheQuiz(scanner);

		BeginQuiz newBegin = new BeginQuiz();
		newBegin.beginTheQuiz(scanner);

		RandomQuestions newQ = new RandomQuestions();
		score =newQ.printQuestions(score,Difficulty.NOVICE,Difficulty.INTERMEDIATE,Difficulty.EXPERT,scanner);

		UIHelper.printScore(score);
		UIHelper.printStats(username,score);
		scanner.close();
	}

}
