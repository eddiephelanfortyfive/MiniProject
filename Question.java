package MiniProject;

public class Question {
	private String difficulty;
	private String category;
	private String question;
	private String optiona;
	private String optionb;
	private String optionc;
	private String optiond;
	private String qanswer;

	public Question(String difficulty, String category, String question, String optiona, String optionb, String optionc,
			String optiond, String qanswer) {
		this.difficulty = difficulty;
		this.category = category;
		this.question = question;
		this.optiona = optiona;
		this.optionb = optionb;
		this.optionc = optionc;
		this.optiond = optiond;
		this.qanswer = qanswer;
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
