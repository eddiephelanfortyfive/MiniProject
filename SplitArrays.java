package MiniProject;

import java.util.ArrayList;

public class SplitArrays {
	public ArrayList<Question> SplitedArray(ArrayList<Question> Questions, Difficulty diff) {
		ArrayList<Question> newArray = new ArrayList<>();
		String difficulty = diff+"";
		for (int i = 0; i < Questions.size(); i++) {
			if (((Questions.get(i)).getDifficulty()).equals(difficulty)) {
				newArray.add(Questions.get(i));
			}

		}
		return newArray;

	}

}
