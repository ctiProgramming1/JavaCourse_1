package labs;

import java.util.Scanner;

public class Lab03_Game {

	public static void main(String[] args) {

		int score = 0;		
		int numberOfQuestions = 5;
		
		
		
		for(int i = 0; i < numberOfQuestions; i++) {
			Scanner reader = new Scanner(System.in);
			int n1 = (int) (Math.random() * 10);
			int n2 = (int) (Math.random() * 10);
			
			System.out.print(n1 + " + " + n2 + " = ");
			
			if(reader.hasNextInt()) {				
				if(reader.nextInt() == (n1 + n2)) 
					score++;								
			}
			else {
				System.out.println("Error: Wrong input!");
			}
					
		}
		
		System.out.println("You score " + score + " out of " + numberOfQuestions);
		
		
		

	}

}
