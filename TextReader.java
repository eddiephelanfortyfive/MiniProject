package MiniProject;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextReader {

    private static final String RESULTS_FILE_PATH = "results.csv";
    private static final String QUESTIONS_FILE_PATH = "QuestionBank.csv";

    public ArrayList<String> readResults() {
        ArrayList<String> quizResults = new ArrayList<>();

        try (BufferedReader resultReader = new BufferedReader(new FileReader(RESULTS_FILE_PATH))) {
            String line;

            while ((line = resultReader.readLine()) != null) {
                String[] values = line.split(",");
                quizResults.add(values[0] + "," + values[1]);
            }
        } catch (IOException e) {
            e.printStackTrace(); 
        }

        return quizResults;
    }

    public ArrayList<Question> readQuestions() {
        ArrayList<Question> questions = new ArrayList<>();

        try (BufferedReader questionReader = new BufferedReader(new FileReader(QUESTIONS_FILE_PATH))) {
            String line;

            while ((line = questionReader.readLine()) != null) {
                String[] values = line.split(",");
                questions.add(new Question(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7]));
            }
        } catch (IOException e) {
            e.printStackTrace(); 
        }

        return questions;
    }
}

