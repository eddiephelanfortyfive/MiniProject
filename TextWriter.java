package MiniProject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextWriter {

	private BufferedWriter writer;
	private static final String RESULTS_FILE_PATH = "results.csv";
	public void WriteScore(String username, int score) {

		try {

			writer = new BufferedWriter(new FileWriter(RESULTS_FILE_PATH, true));

			String[] data = { username, Integer.toString(score) };
			String dataLine = String.join(",", data);
			writer.write(dataLine);
			writer.newLine();

			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
