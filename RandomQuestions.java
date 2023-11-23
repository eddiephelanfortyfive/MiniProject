package MiniProject;

import java.util.ArrayList;
import java.util.Random;

public class RandomQuestions {
	public int RondomiseQuesionts(int score,Difficulty diff, String level, ArrayList<Question> Questions) {
		String roundNum = "---------------------------------------------------------------------------------------------------------\n"
				+ "                                          ROUND " + level + " LEVEL: " + diff + "\n"
				+ "---------------------------------------------------------------------------------------------------------\n";
		UIHelper newRound = new UIHelper();
		newRound.typingText(roundNum, 7);
		Random rand = new Random();
		int prevnum = 0;
		for (int j = 0; j < 1; j++) {
			int maximum = 5;
			for (int i = 0; i < 2; i++) {
				int questionNumber = rand.nextInt(maximum);
				Question Q = Questions.get(questionNumber);
				if (prevnum != questionNumber) {
					printQuestionNumber(i + 1);
					questionMaker maker = new questionMaker((Q).getDifficulty(), (Q).getCategory(), (Q).getQuestion(),
							(Q).getOptiona(), (Q).getOptionb(), (Q).getOptionc(), (Q).getOptiond(), (Q).getAnswer());
					score = maker.makeQuestion(score);
				} else {
					i--;
				}
				prevnum = questionNumber;
			}

		}
		return score;
	}

	public void printQuestionNumber(int i) {
		String qNum = "--Question " + i + "--\n";
		UIHelper newnumber = new UIHelper();
		newnumber.typingText(qNum, 5);
	}

	public int printQuestions(int score, Difficulty novice, Difficulty intermediate, Difficulty expert) {
		TextReader readQuestions = new TextReader();
		ArrayList<Question> Questions = readQuestions.readQuestions();
		RandomQuestions newQ = new RandomQuestions();
		SplitArrays newArray = new SplitArrays();
		score = newQ.RondomiseQuesionts(score, novice, "ONE", newArray.SplitedArray(Questions, novice));
		score = newQ.RondomiseQuesionts(score, intermediate, "TWO", newArray.SplitedArray(Questions, intermediate));
		score = newQ.RondomiseQuesionts(score, expert, "THREE", newArray.SplitedArray(Questions, expert));
		return score;
	}

}
