package javaPrograms;

import java.util.Scanner;

public class MultipuleChoiceQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String q1 = "What coloris sky?\n"
				+"(a)Blue/green\n(b)Orange/red\n(c)Magenta\n";
		
		String q2 = "What coloris sea?\n"
				+"(a)white/green\n(b)Blue/red\n(c)yello\n";
		Question[] questions= {
				new Question(q1,"a"),
				new Question(q2,"b")
		};
		takeTest(questions);
		}
		public static void takeTest(Question[] questions) {
			int score=0;
			Scanner keyboardInput=new Scanner(System.in);
			for(int i=0;i<questions.length;i++) {
				System.out.println(questions[i].prompt);
				String answer = keyboardInput.nextLine();
				if(answer.equals(questions[i].answer)) {
					score++;
				}
			}
			System.out.println("You got "+score+" out of "+questions.length);
		}
	}
