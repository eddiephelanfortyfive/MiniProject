package MiniProject;

public class QuestionBank {
	public int Novice(int score) {
		RandomiseQuestions newRandom = new RandomiseQuestions();
		String difficulty = "NOVICE";
		String level = "ONE";
		String[] Q1 = { "Descrete Mathmatics", "Which of the following represents the intersection of two sets A and B",
				"A - B", "A ∪ B", "A ∩ B", "A × B", "c" };
		String[] Q2 = { "Descrete Mathmatics", "What is the result of the following expression?\n(A AND B) OR (NOT C)",
				"True if A and B are both true, regardless of C.", "True if either A and B are true or C is false.",
				"True if A and B are both true and C is false.", "True if A is true, B is false, and C is true.", "a" };
		String[] Q3 = { "Computer Science Foundations", "Which one of these statments relates to ¬(A∨B)?", "A AND B",
				"A OR B", "The negation of A AND B", "The negation of A OR B", "d" };
		String[] Q4 = { "Computer Science Foundations",
				"Which of the following is a universal set containing all the elements in a specific context?",
				"Power set", "Subset", "Conplament set", "Sample space", "d" };
		String[] Q5 = { "Computer Organisation", "What is the primary function of an operating system?",
				"Running applications", "Storing data", "Managing hardware and resources", "Creating Websites", "c" };
		String[] Q6 = { "Computer Organisation",
				"What is the term for a high-level programming language that is easy to read and write, often used for teaching programming concepts?",
				"Assembly language", "Machine code", "Python", "Binary code", "c" };
		score = newRandom.pick2Questions(score, level, difficulty, Q1, Q2, Q3, Q4, Q5, Q6);
		return score;
	}

	public int Intermediate(int score) {
		RandomiseQuestions newRandom = new RandomiseQuestions();
		String difficulty = "INTERMEDIATE";
		String level = "TWO";
		String[] Q1 = { "Descrete Mathmatics", "What are the domain and codomain of a function?",
				"The domain is the set of all possible inputs, and the codomain is the set of all possible outputs",
				"The domain is the set of all possible outputs, and the codomain is the set of all possible inputs",
				"The domain is the set of all possible inputs, and the codomain is a single output value",
				"The domain and codomain of a function are the same set", "a" };
		String[] Q2 = { "Descrete Mathmatics",
				"In a Knights and Knaves scenario. A and B. A says, \"A says \"We are the same kind.\"\" B says \"We are different kinds.\"\nBased on A and B's statements, What can you conclude about A and B?",
				"A is a Knight, and B is a Knight.", "A is a Knight, and B is a Knave.",
				"A is a Knave, and B is a Knave.", "A is a Knave, and B is a Knight.", "d" };
		String[] Q3 = { "Computer Science Foundations",
				"What does the term \"object-oriented programming\" (OOP) refer to in computer science?",
				"A coding style that focuses on optimizing program execution speed",
				"A programming paradigm that uses objects to model real-world entities and their interactions",
				"A method for designing computer hardware", "A language used for low-level system programming", "b" };
		String[] Q4 = { "Computer Science Foundations", "Which one of these represents De Morgan's law:",
				"¬(X ∧ Y) ≡ (¬X ∨ ¬Y)", "¬(X ∧ Y) ≡ (¬X ≡ ¬Y)", "(X ∧ Y) ∨ (X ∨ Y)", "¬(X ∧ Y) ≡ ¬(¬X ∨ ¬Y)", "a" };
		String[] Q5 = { "Computer Organisation", "What is the function of a level 0 in a multilevel machine?",
				"Implements interpreters and translators",
				"Binary inputs used to create memory or execute instructions", "Fetch, Decode, Execute cycle",
				"Provides power to the computer", "b" };
		String[] Q6 = { "Computer Organisation", "What is the purpose of the Arithmetic Logic Unit (ALU) in a CPU?",
				"To perform arithmetic and logical operations", "To store program instructions",
				"To manage memory allocation", "To control input/output devices", "a" };
		score = newRandom.pick2Questions(score, level, difficulty, Q1, Q2, Q3, Q4, Q5, Q6);
		return score;
	}

	public int Expert(int score) {
		RandomiseQuestions newRandom = new RandomiseQuestions();
		String difficulty = "EXPERT";
		String level = "THREE";
		String[] Q1 = { "Descrete Mathmatics",
				"Which of the following is a property of an equivalence relation in set theory?", "Reflexivity",
				"Injectivity", "Linearity", "Partiality", "a" };
		String[] Q2 = { "Descrete Mathmatics",
				"In set theory, what is the cardinality of the power set of a set with n elements?", "n", "2^n", "2n",
				"n!", "b" };
		String[] Q3 = { "Computer Science Foundations",
				"In computer science, what is the purpose of an \"API\" (Application Programming Interface), and why is it a crucial concept in software development?",
				"An API is a type of software testing tool, and it is crucial for identifying and fixing software bugs.",
				"An API is a user interface for operating systems, and it is crucial for designing graphical user interfaces (GUIs).",
				"An API is a set of rules and protocols that allow different software applications to communicate and interact, and it is crucial for enabling software components to work together efficiently.",
				"An API is a type of programming language, and it is crucial for creating new operating systems.",
				"c" };
		String[] Q4 = { "Computer Science Foundations",
				"In a bounded lattice, which of the following statements is true?",
				"There is a unique greatest element and a unique least element.",
				"There is no greatest element, but there is a unique least element.",
				"There is a unique greatest element, but there is no least element.",
				"There is no greatest element and no least element.", "a" };
		String[] Q5 = { "Computer Organisation",
				"What is the purpose of a cache memory hierarchy in a computer system?",
				"To increase the overall memory capacity of the system", "To reduce the latency in memory access",
				"To provide permanent storage for the operating system", "To enhance the clock speed of the CPU", "b" };
		String[] Q6 = { "Computer Organisation", "Which of these best describes the Von Neumann bottleneck?",
				"Is the limited speed of data transfer between the CPU and RAM, causing the CPU to wait for data from memory.",
				"Is a hardware flaw that affects the CPU's ability to execute complex instructions.",
				"Is a software limitation that restricts the types of programs that can run on a computer.",
				"Is a security vulnerability that allows unauthorized access to a computer's memory.", "b" };
		score = newRandom.pick2Questions(score, level, difficulty, Q1, Q2, Q3, Q4, Q5, Q6);
		return score;
	}
}
