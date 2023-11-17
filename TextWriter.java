package MiniProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextWriter {

	private BufferedWriter writer;

	public TextWriter(String username, int score) {

		String username1 = username;

		try {

			writer = new BufferedWriter(new FileWriter("results.csv", true));

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
