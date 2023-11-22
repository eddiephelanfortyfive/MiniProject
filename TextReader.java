package MiniProject;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextReader {

	private BufferedReader reader;

	public ArrayList<String> readResults() {

		ArrayList<String> playerHistory = new ArrayList<String>();

		try {

			reader = new BufferedReader(new FileReader("results.csv"));

			String line;

			while ((line = reader.readLine()) != null) {

				String[] values = line.split(",");

				playerHistory.add(values[0] + "," + values[1]);

			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return playerHistory;
	}

	public ArrayList<Question> readQuestions() {
		BufferedReader reader;
		ArrayList<Question> Questions = new ArrayList<Question>();

		try {
			reader = new BufferedReader(new FileReader("QuestionBank.csv"));

			String line;

			while ((line = reader.readLine()) != null) {
				String[] values = line.split(",");

				Questions.add(new Question(values[0], values[1], values[2], values[3], values[4], values[5], values[6],
						values[7]));
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Questions;
	}
}
