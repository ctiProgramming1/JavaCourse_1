package labs;

import java.util.Scanner;

public class Lab02 {
	public static void main(String[] args) {
		
		System.out.println( (int) (Math.random() * 10));
		
		Scanner r = new Scanner(System.in);
		
		System.out.print("Enter the length: ");
		
		if(r.hasNextDouble()) {
			double length = r.nextDouble();	
			if(length >= 0) {
				double area = Math.pow(length, 2);
				System.out.println("The area = " + area);
			}
			else {
				System.out.println("Error: invalid Number !!");
			}

		}
		else {
			System.out.println("Error: invalid input !!");
		}

		r.close();		
	}
}
