package MiniProject;

import java.util.ArrayList;
import java.util.Arrays;

public class StatsForMaths {
	private static final String ALL_PLAYERS_STATISTICS = "all";
	public ArrayList<Double> getPlayerStats(String username) {

		TextHandler csvFileRead = new TextHandler();

		ArrayList<String> listOfAllQuizEntries = csvFileRead.readResults();

		ArrayList<Double> points = new ArrayList<Double>();

		ArrayList<Double> resultStats = new ArrayList<Double>();

		for (int i = 0; i < listOfAllQuizEntries.size(); i++) {

			String[] values = listOfAllQuizEntries.get(i).split(",");

			double scoreAsDouble = Double.parseDouble(values[1]);

			if (username.equals(ALL_PLAYERS_STATISTICS )) {
				points.add(scoreAsDouble);
			} else if (username.equals(values[0])) {
				points.add(scoreAsDouble);
			}

		}

		double[] pointsArray = points.stream().mapToDouble(Double::doubleValue).toArray();

		double sum = 0;

		for (int i = 0; i < pointsArray.length; i++) {
			sum += pointsArray[i];
		}

		Double meanResult = sum / (double) pointsArray.length;

		resultStats.add(0, meanResult);

		Arrays.sort(pointsArray);
		int length = pointsArray.length;

		if (pointsArray.length % 2 != 0) {
			resultStats.add(1, (double) pointsArray[length / 2]);

		} else {
			resultStats.add(1, (double) (pointsArray[(length - 1) / 2] + pointsArray[length / 2]) / 2.0);
		}

		double standardDeviation = 0.0;
		double square = 0.0;
		double standardResult = 0.0;

		for (int i = 0; i < length; i++) {
			standardDeviation = standardDeviation + Math.pow((pointsArray[i] - meanResult), 2);
		}

		square = standardDeviation / length;

		standardResult = Math.sqrt(square);

		resultStats.add(2, +standardResult);

		return resultStats;

	}

	public ArrayList<String> compareStats(ArrayList<Double> playerStats, ArrayList<Double> allStats) {

		ArrayList<String> comparison = new ArrayList<String>();

		double currentPlayerMean = playerStats.get(0);
		double currentPlayerMedian = playerStats.get(1);
		double currentPlayerStandardDev = playerStats.get(2);

		double globalMean = allStats.get(0);
		double globalMedian = allStats.get(1);
		double globalStandardDev = allStats.get(2);

		if (currentPlayerMean > globalMean) {

			comparison.add(0, "greater than");
		} else {
			comparison.add(0, "less than");
		}

		if (currentPlayerMedian > globalMedian) {

			comparison.add(1, "greater than");
		} else {
			comparison.add(1, "less than");
		}

		if (currentPlayerStandardDev > globalStandardDev) {

			comparison.add(2, "greater than");
		} else {
			comparison.add(2, "less than");
		}

		return comparison;

	}

}