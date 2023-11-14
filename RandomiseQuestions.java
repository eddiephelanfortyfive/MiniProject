package MiniProject;

import java.util.Random;

public class RandomiseQuestions {
	public int Q1(int score, String category, String question, String A, String B, String C, String D,
			String answerForQ) {
		CreateQuestions newQuestion = new CreateQuestions();
		score = newQuestion.questionMaker(score, category, question, A, B, C, D, answerForQ);
		return score;
	}
	public int Q2(int score, String category, String question, String A, String B, String C, String D,
			String answerForQ) {
		CreateQuestions newQuestion = new CreateQuestions();
		score = newQuestion.questionMaker(score, category, question, A, B, C, D, answerForQ); 
		return score;
	}
	public int Q3(int score, String category, String question, String A, String B, String C, String D,
			String answerForQ) {
		CreateQuestions newQuestion = new CreateQuestions();
		score = newQuestion.questionMaker(score, category, question, A, B, C, D, answerForQ);
		return score;
	}
	public int Q4(int score, String category, String question, String A, String B, String C, String D,
			String answerForQ) {
		CreateQuestions newQuestion = new CreateQuestions();
		score = newQuestion.questionMaker(score, category, question, A, B, C, D, answerForQ);
		return score;
	}
	public int Q5(int score, String category, String question, String A, String B, String C, String D,
			String answerForQ) {
		CreateQuestions newQuestion = new CreateQuestions();
		score = newQuestion.questionMaker(score, category, question, A, B, C, D, answerForQ);
		return score;
	}
	public int Q6(int score, String category, String question, String A, String B, String C, String D,
			String answerForQ) {
		CreateQuestions newQuestion = new CreateQuestions();
		score = newQuestion.questionMaker(score, category, question, A, B, C, D, answerForQ);
		return score;
	}
	
	public int pick2Questions(int score, String level,String difficulty,String[] Q1, String[] Q2, String[] Q3 , String[] Q4, String[] Q5, String[] Q6) {

		Random rand = new Random();
		int count0=0;
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int maximum = 5;
		String roundNum="---------------------------------------------------------------------------------------------------------\n" 
					  + "                                          ROUND "+level+" LEVEL: "+difficulty+"\n" 
					  + "---------------------------------------------------------------------------------------------------------\n";
		UIHelper newRound = new UIHelper(); 
		newRound.typingText(roundNum, 7);
		
		for (int i = 1; i <= 2; i++) {
			
			int questionNumber = rand.nextInt(maximum);
			if (questionNumber == 0&&count0==0) {
				count0++;
				score = Q1(score, Q1[0] ,Q1[1], Q1[2], Q1[3], Q1[4], Q1[5], Q1[6]);
			} else if (questionNumber == 1&&count1==0) {
				printQuestionNumber(i);
				count1++;
				score = Q2(score, Q2[0], Q2[1], Q2[2], Q2[3], Q2[4], Q2[5], Q2[6]);
			} else if (questionNumber == 2&&count2==0) {
				printQuestionNumber(i);
				count2++;
				score = Q3(score, Q3[0], Q3[1], Q3[2], Q3[3], Q3[4], Q3[5], Q3[6]);
			} else if (questionNumber == 3&&count3==0) {
				printQuestionNumber(i);
				count3++;
				score = Q4(score, Q4[0], Q4[1], Q4[2], Q4[3], Q4[4], Q4[5], Q4[6]);
			} else if (questionNumber == 4&&count4==0) {
				printQuestionNumber(i);
				count4++;
				score = Q5(score, Q5[0], Q5[1], Q5[2], Q5[3], Q5[4], Q5[5], Q5[6]);
			} else if (questionNumber == 5&&count5==0) {
				printQuestionNumber(i);
				count5++;
				score = Q6(score, Q6[0], Q6[1], Q6[2], Q6[3], Q6[4], Q6[5], Q6[6]);
			}else {i--;}
		}
		return score;
		}
	public void printQuestionNumber(int i) {
		String qNum="Question "+i+"\n";
		UIHelper newnumber = new UIHelper(); 
		newnumber.typingText(qNum, 5);
	}

}
