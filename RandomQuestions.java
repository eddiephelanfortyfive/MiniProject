package MiniProject;

import java.util.ArrayList;
import java.util.Random;

public class RandomQuestions {
	public int RondomiseQuesionts(int score, String difficulty, String level, ArrayList<Question> Questions) {
		String roundNum = "---------------------------------------------------------------------------------------------------------\n"
				+ "                                          ROUND " + level + " LEVEL: " + difficulty + "\n"
				+ "---------------------------------------------------------------------------------------------------------\n";
		UIHelper newRound = new UIHelper();
		newRound.typingText(roundNum, 7);
		Random rand = new Random();
		int prevnum=0;
		for(int j = 0; j < 1; j++) {
		int maximum = 5;
		for (int i = 0; i < 2; i++) {
			int questionNumber = rand.nextInt(maximum);
			Question Q = Questions.get(questionNumber);
			if(prevnum!=questionNumber) {
				printQuestionNumber(i+1);
			questionMaker maker = new questionMaker((Q).getDifficulty(), (Q).getCategory(), (Q).getQuestion(),
					(Q).getOptiona(), (Q).getOptionb(), (Q).getOptionc(), (Q).getOptiond(), (Q).getAnswer());
			score=maker.makeQuestion(score);
			}else {i--;}
			prevnum=questionNumber;
		}
		
		}
		return score;
	}
	public void printQuestionNumber(int i) {
		String qNum = "--Question " + i + "--\n";
		UIHelper newnumber = new UIHelper();
		newnumber.typingText(qNum, 5);
	}

	public int printQuestions(int score) {
		TextReader readQuestions = new TextReader();
		ArrayList<Question> Questions = readQuestions.readQuestions();
		RandomQuestions newQ = new RandomQuestions();
		SplitArrays newArray = new SplitArrays();
		ArrayList<Question> novice = newArray.SplitedArray(Questions, "NOVICE");
		ArrayList<Question> intermediate = newArray.SplitedArray(Questions, "INTERMEDIATE");
		ArrayList<Question> expert = newArray.SplitedArray(Questions, "EXPERT");
		score = newQ.RondomiseQuesionts(score, "NOVICE", "ONE", novice);
		score = newQ.RondomiseQuesionts(score, "INTERMEDIATE", "TWO", intermediate);
		score = newQ.RondomiseQuesionts(score, "EXPERT", "THREE", expert);
		return score;
	}

}
