package MiniProject;

import java.util.Scanner;

public class BeginQuiz {
	public void BeginQuiz(){
		System.out.println("Are you ready to begin?: Y/N");
	Scanner scanner = new Scanner(System.in);
	String begin = scanner.nextLine();
	
	begin = begin.toLowerCase();
	
	// Check if begin is y, if not, exit the quiz, or else return an error
	if (begin.equals("y")) {
		
		} else if (begin.equals("n")) {

			System.out.println("okay see you next time!");
			System.exit(0);
			} else {
				System.out.println("Invalid input");
				System.exit(0);
			}
	}

}
