package i2.client;

import i2.logic.Quiz;

public class QuizManager {

	public static void main(String[] args) {
		Quiz q=new Quiz(491,70);
		Quiz q1=new Quiz();
		q.addMarks();
		q.displayQuizDetails();

	}

}
