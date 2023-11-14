package MiniProject;

import java.util.Scanner;

public class CreateQuestions {
	
	public int questionMaker(int score, String category, String question, String A, String B,
			String C, String D, String answerForQ) {
		UIHelper newUI = new UIHelper();
		String questionnew ="CATEGORY: "+category+" \n"
				+ ""+question+"\n"
				+ "\n"
				+ "A. "+A+"\n"
				+ "B. "+B+"\n"
				+ "C. "+C+"\n"
				+ "D. "+D+"\n"
				+ "Enter answer:\n";
		newUI.typingText(questionnew, 5);
		for (int i=0; i<1; i++) {
			Scanner answer = new Scanner(System.in);
			String input = answer.nextLine();
			input = input.toLowerCase();
			if(input.equals("a")||input.equals("b")||input.equals("c")||input.equals("d")) {
			if (input.equals(answerForQ)) {
				score++;
			}
			}else {newUI.typingText("Invalid input please try again.\n"
					+ "Enter answer:\n", 10);
			i--;}
			}
		
		return score;
	}

}
