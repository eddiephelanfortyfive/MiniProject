package MiniProject;

public class MainQuiz {
	public static void main(String[] args) {
		int score = 0;

		UIHelper UIHelper = new UIHelper();
		UIHelper.welcome();

		LoginToQuiz newUser = new LoginToQuiz();
		String username = newUser.loginToTheQuiz();

		BeginQuiz newBegin = new BeginQuiz();
		newBegin.BeginTheQuiz();

		RandomQuestions newQ = new RandomQuestions();
		score =newQ.printQuestions(score,Difficulty.NOVICE,Difficulty.INTERMEDIATE,Difficulty.EXPERT);

		UIHelper.printScore(score);
		UIHelper.printStats(username,score);

	}

}
