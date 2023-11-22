package MiniProject;

public class MainQuiz {
	public static void main(String[] args) {
		int score = 0;

		UIHelper UIHelper = new UIHelper();
		UIHelper.welcome();

		LoginToQuiz username = new LoginToQuiz();
		String username1 = username.LoginToTheQuiz();

		BeginQuiz newBegin = new BeginQuiz();
		newBegin.BeginTheQuiz();

		RandomQuestions newQ = new RandomQuestions();
		score =newQ.printQuestions(score,"NOVICE","INTERMEDIATE","EXPERT");

		UIHelper.printScore(score);
		UIHelper.printStats(username1,score);

	}

}
