package MiniProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainQuiz {
	public static void main(String[] args) {
		int score = 0;	//initializing the variable score which counts how many questions the player answered correctly
		
		 /* Start quiz and get user-name
		 * This also checks if you've played before
		 */
		UIHelper UIHelper = new UIHelper();
		UIHelper.welcome();	
		/*This class prints out Header for the quiz*/
		
		LoginToQuiz username = new LoginToQuiz();
		String username1 = username.LoginToQuiz();
		/*Calling the login class and initializing the variable username1 and assigning it
		 * to the output of the method user-name in the class logintoquiz*/
		
		BeginQuiz newBegin = new BeginQuiz();
		newBegin.BeginQuiz();
		//System.out.println("Are you ready to begin?: Y/N");
		/*asking the player if they would like to begin the game*/
		
		
		/*Scanner scanner = new Scanner(System.in);
		String begin = scanner.nextLine();
		
		
		
		// Check if begin is y, if not, exit the quiz, or else return an error
		if (begin.equals("y")) {
			
			} else if (begin.equals("n")) {
	
				System.out.println("okay see you next time!");
				System.exit(0);
				} else {
					System.out.println("Invalid input");
					System.exit(0);
		}*/
		
		//Start questions
		
				
		QuestionBank newdifficulty = new QuestionBank();
		score=newdifficulty.Novice(score);
		score=newdifficulty.Intermediate(score);
		score=newdifficulty.Expert(score);
		
		//printing users score	
		UIHelper.printScore(score);
		// Write the scores to the c.s.v. file
		TextWriter scoreWriter = new TextWriter(username1, score);
		/*
		 * Calculate statistics for your quiz and your previous quizzes
		 * compares your stat's to all other quiz's ever played
		 * Displays statistics
		 */
		UIHelper.printStats(username1);
		
	}

}
