package HarryPotterHouseSorter;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		
		
		
		String q1 = "What is your favorite color?\n" +
		"a)Red\nb)Yellow\nc)Green\nd)Blue";
		String q2 = "Which class would be your favorite?\n" +
		"a)Defense Against the Dark Arts\nb)Charms\nc)Potions\nd)I would excel at all things Magic!";
		String q3 = "Which trait best describes you?\n" +
		"a)Loyal\nb)Patient\nc)Ambitious\nd)Intelligent";
		String q4 = "What is your fatal flaw?\n" +
		"a)You're wreckless at times\nb)You are too nice for your own good\nc)You're sometimes arrogant\n" +
				"d)You are known as the \"know it all in your group\"";
		String q5 = "What motto best describes you?\n" +
				"a)Do what is Right\nb)Do what is Nice\nc)Do what is Necessary\nd)Do what is Wise";
		String q6 = "You see a kid in the year below you being picked on, which action would you take?\n" +
			"a)I would confront the bully\nb)I would check on the kid\nc)Nothing. It's none of my business\nd)I would tell a professor.";
		
		String [] testQuestions = {   // array of the questions
				q1,
				q2,
				q3,
				q4,
				q5,
				q6
		};

		letTheSortingBegin(testQuestions);
		
		
		
		
				
		
	} // end of main class
	
	
	public static void letTheSortingBegin (String[] testQuestions) {
	
		
		Scanner scan = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		for (int i = 0; i < testQuestions.length; i++) {
			
			System.out.println(testQuestions[i]);
			String answer = scan.nextLine();
			 if (answer.equals ("a")) {
				 a++;
				 
			 }
			 else if (answer.contentEquals("b")) {
				 b++;
			 }
			 
			 else if (answer.contentEquals("c")) {
				 c++;
			 }
			 
			 else if (answer.contentEquals("d")) {
				 d++;
			 }
			 	
			
		} // ends for loop
		
		sort.whichHouse(a, b, c, d);
		
	}
	

}
