package MiniProject;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomQuestions {
	private static final int QUESTIONS_PER_ROUND = 2;
    private static final int MAXIMUM_QUESTIONS = 5;

	public int RondomiseQuesionts(int score,Difficulty diff, ArrayList<Question> Questions, Scanner scanner) {
		String roundNum = "---------------------------------------------------------------------------------------------------------\n"
                + "                                             "+diff + "  LEVEL\n"
                + "---------------------------------------------------------------------------------------------------------\n";
        UIHelper newRound = new UIHelper();
        newRound.typingText(roundNum, newRound.GetTEXT_SLEEP_MEDIUM_SLOW());
        Random rand = new Random();
        int prevNum = -1;

        for (int i = 0; i < QUESTIONS_PER_ROUND; i++) {
            int questionNumber;
            do {
                questionNumber = rand.nextInt(MAXIMUM_QUESTIONS);
            } while (questionNumber == prevNum);

            Question q = Questions.get(questionNumber);
            printQuestionNumber(i + 1);
            questionMaker maker = new questionMaker(q.getDifficulty(), q.getCategory(), q.getQuestion(),
                    q.getOptiona(), q.getOptionb(), q.getOptionc(), q.getOptiond(), q.getAnswer());
            score = maker.makeQuestion(score,scanner);

            prevNum = questionNumber;
        }

        return score;
	}

	public void printQuestionNumber(int i) {
		String qNum = "--Question " + i + "--\n";
		UIHelper newnumber = new UIHelper();
		newnumber.typingText(qNum, newnumber.GetTEXT_SLEEP_MEDIUM_FAST());
	}

	public int printQuestions(int score, Difficulty novice, Difficulty intermediate, Difficulty expert, Scanner scanner) {
		TextHandler readQuestions = new TextHandler();
		ArrayList<Question> Questions = readQuestions.readQuestions();
		RandomQuestions newQ = new RandomQuestions();
		SplitArrays newArray = new SplitArrays();
		score = newQ.RondomiseQuesionts(score, novice, newArray.SplitedArray(Questions, novice),scanner);
		score = newQ.RondomiseQuesionts(score, intermediate, newArray.SplitedArray(Questions, intermediate),scanner);
		score = newQ.RondomiseQuesionts(score, expert, newArray.SplitedArray(Questions, expert),scanner);
		return score;
	}

}
