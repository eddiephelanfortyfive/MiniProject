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

		QuestionBank newdifficulty = new QuestionBank();
		score = newdifficulty.Novice(score);
		score = newdifficulty.Intermediate(score);
		score = newdifficulty.Expert(score);

		UIHelper.printScore(score);
		UIHelper.printStats(username1);

	}

}
