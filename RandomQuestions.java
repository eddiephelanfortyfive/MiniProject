package MiniProject;

import java.util.ArrayList;
import java.util.Random;

public class RandomQuestions {
	private static final int QUESTIONS_PER_ROUND = 2;
    private static final int MAXIMUM_QUESTIONS = 5;

	public int RondomiseQuesionts(int score,Difficulty diff, String level, ArrayList<Question> Questions) {
		String roundNum = "---------------------------------------------------------------------------------------------------------\n"
                + "                                             "+diff + "  LEVEL\n"
                + "---------------------------------------------------------------------------------------------------------\n";
        UIHelper newRound = new UIHelper();
        newRound.typingText(roundNum, 7);
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
            score = maker.makeQuestion(score);

            prevNum = questionNumber;
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
