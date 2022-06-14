package HarryPotterHouseSorter;

import java.util.Scanner;

public class sort {

	
	
	
	
	// GRYFFINDOR, HUFFLEPUFF, SLYTHERIN, RAVENCLAW
	public static void whichHouse(int a, int b, int c, int d) {
		Scanner scan1 = new Scanner(System.in);
		
		
		 // backup questions in the case of a tie
		String qAB = "Your teacher canceled class, so now you have a free period.  How would you chose to spend it?\n" +
				"a)Go play quiditich with your friends\nb)hang out with your friends in the courtyard";
		
		String qAC = "Your teacher canceled class, so now you have a free period.  How would you chose to spend it?\n" +
				"a)Go play quiditich with your friends\nb)find a way to gain an advantage for your house";
		
		
		String qAD = "Your teacher canceled class, so now you have a free period.  How would you chose to spend it?\n" +
		"a)Go play quiditich with your friends\nb)go to the library";
		
		String qBC = "Your teacher canceled class, so now you have a free period.  How would you chose to spend it?\n" +
				"a)hang out with your friends in the courtyard\nb)find a way to gain an advantage for your house";
		
		String qBD = "Your teacher canceled class, so now you have a free period.  How would you chose to spend it?\n" +
				"a)hang out with your friends in the courtyard\nb)go to the library";
		
		String qCD = "Your teacher canceled class, so now you have a free period.  How would you chose to spend it?\n" +
		"a)find a way to gain an advantage for your house\nb)go to the library";
		
		
		
		
		
		
		
		if (a > b && a > c && a > d) {
			System.out.println("GRYFFINDOR!!!!");
			
		}
		else if (b > a && b > c && b > d) {
			System.out.println("HUFFLEPUFF!!!!");
			
		}
		else if (c > a && c > b && c > d) {
			System.out.println("SLYTHERIN!!!!");
			
		}
		else if (d > a && d > b && d > c) {
			System.out.println("RAVENCLAW!!!!");
			
		}
		// tie between a & b
		else if (a == b && a>c && a >d && b> c && b > d) {
			
			
			System.out.println(qAB);
			String tieBreak = scan1.nextLine();
			if (tieBreak.contentEquals("a")) {
				System.out.println("GRYFFINDOR!!!!");
			}
			else {
				System.out.println("HUFFLEPUFF!!!!");
			}
			
		}
		// tie between a & c
		else if (a == c && a>b && a >d && c> b && c > d) {
			
			
			System.out.println(qAC);
			String tieBreak = scan1.nextLine();
			if (tieBreak.contentEquals("a")) {
				System.out.println("GRYFFINDOR!!!!");
			}
			else {
				System.out.println("SYLTHERIN!!!!");
			}
			
		}
		// tie between a & d
		else if (a == d && a>b && a >c && d> b && d > c) {
			
			
			System.out.println(qAD);
			String tieBreak = scan1.nextLine();
			if (tieBreak.contentEquals("a")) {
				System.out.println("GRYFFINDOR!!!!");
			}
			else {
				System.out.println("RAVENCLAW!!!!");
			}
			
		}
		// tie between b & c
		else if (b == c && b>a && b >d && c> a && c > d) {
			
			
			System.out.println(qBC);
			String tieBreak = scan1.nextLine();
			if (tieBreak.contentEquals("a")) {
				System.out.println("HUFFLEPUFF!!!!");
			}
			else {
				System.out.println("SYLTHERIN!!!!");
			}
		}
		// tie between b & d
		else if (b == d && b>a && b >c && d> a && d > c) {
			
			
			System.out.println(qBD);
			String tieBreaker = scan1.nextLine();
			if (tieBreaker.contentEquals("a")) {
				System.out.println("HUFFLEPUFF!!!!");
			}
			else {
				System.out.println("RAVENCLAW!!!!");
			}
		}
		// tie between c & d
		else if (c == d && c>a && c >b && d> a && d > b) {
			
			
			System.out.println(qCD);
			String tieBreaker = scan1.nextLine();
			if(tieBreaker.contentEquals("a")) {
				System.out.println("SLYTHERIN!!!!");
			}
			else {
				System.out.println("RAVENCLAW!!!!");
			}
			
		}
		
		
		
	} // end of whichHouse
	
}
