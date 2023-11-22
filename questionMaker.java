package MiniProject;

import java.util.Scanner;

public class questionMaker {
	private String difficulty;
	private String category;
	private String question;
	private String optiona;
	private String optionb;
	private String optionc;
	private String optiond;
	private String qanswer;

	public questionMaker(String difficulty, String category, String question, String optiona, String optionb,
			String optionc, String optiond, String qanswer) {
		this.difficulty = difficulty;
		this.category = category;
		this.question = question;
		this.optiona = optiona;
		this.optionb = optionb;
		this.optionc = optionc;
		this.optiond = optiond;
		this.qanswer = qanswer;
	}

	public int makeQuestion(int score) {
		UIHelper newUI = new UIHelper();
		String questionnew = "CATEGORY: " + category + " \n" + "" + question + "\n" + "\n" + "	A. " + optiona + "\n"
				+ "	B. " + optionb + "\n" + "	C. " + optionc + "\n" + "	D. " + optiond + "\n" + "\nEnter answer:\n";
		newUI.typingText(questionnew, 5);
		for (int i = 0; i < 1; i++) {
			Scanner answer = new Scanner(System.in);
			String input = answer.nextLine();
			input = input.toLowerCase();
			if (input.equals("a") || input.equals("b") || input.equals("c") || input.equals("d")) {
				if (input.equals(qanswer)) {
					newUI.typingText("--Correct--\n\n", 5);
					score++;
				} else {
					newUI.typingText("--Incorrect--\n\n", 5);
				}
			} else {
				newUI.typingText("Invalid input please try again.\n" + "Enter answer:\n", 10);
				i--;
			}
		}

		return score;

	}

	public String getDifficulty() {
		return difficulty;
	}

	public String getCategory() {
		return category;
	}

	public String getQuestion() {
		return question;
	}

	public String getOptiona() {
		return optiona;
	}

	public String getOptionb() {
		return optionb;
	}

	public String getOptionc() {
		return optionc;
	}

	public String getOptiond() {
		return optiond;
	}

	public String getAnswer() {
		return qanswer;
	}
}