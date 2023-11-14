package MiniProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainQuiz {
	public static void main(String[] args) {
		int score = 0;	
		UIHelper UIHelper = new UIHelper();
		UIHelper.welcome();	
		LoginToQuiz username = new LoginToQuiz();
		String username1 = username.LoginToQuiz();
		
		BeginQuiz newBegin = new BeginQuiz();
		newBegin.BeginQuiz();
		
				
		QuestionBank newdifficulty = new QuestionBank();
		score=newdifficulty.Novice(score);
		score=newdifficulty.Intermediate(score);
		score=newdifficulty.Expert(score);
		
			
		UIHelper.printScore(score);
		TextWriter scoreWriter = new TextWriter(username1, score);
		UIHelper.printStats(username1);
		
	}

}
