package MiniProject;

import java.util.Scanner;

public class CreateQuestions {
	
	public int questionMaker(int score, String category, String question, String A, String B,
			String C, String D, String answerForQ) {
		System.out.printf("CATEGORY: %s \n"
				+ "%s\n"
				+ "\n"
				+ "A. %s\n"
				+ "B. %s\n"
				+ "C. %s\n"
				+ "D. %s\n"
				+ "Enter answer:\n",category,question,A,B,C,D);
		for (int i=0; i<1; i++) {
			Scanner answer = new Scanner(System.in);
			String input = answer.nextLine();
			input = input.toLowerCase();
			if(input.equals("a")||input.equals("b")||input.equals("c")||input.equals("d")) {
			if (input.equals(answerForQ)) {
				score++;
			}
			}else {System.out.printf("Invalid input please try again.\n"
					+ "Enter answer:\n");
			i--;}
			}
		
		return score;
	}

}
