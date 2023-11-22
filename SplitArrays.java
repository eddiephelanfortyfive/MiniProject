package MiniProject;

import java.util.ArrayList;

public class SplitArrays {
	public ArrayList<Question> SplitedArray(ArrayList<Question> Questions, String difficulty) {
		ArrayList<Question> newArray = new ArrayList<>();
		for (int i = 0; i < Questions.size(); i++) {
			if (((Questions.get(i)).getDifficulty()).equals(difficulty)) {
				newArray.add(Questions.get(i));
			}

		}
		return newArray;

	}

}
