package MiniProject;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class TextReader {

	private BufferedReader reader;

	public ArrayList<String> readCSVFile() {

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

}
