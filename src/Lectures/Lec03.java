/* 
  Lecture 3: Conditional if-statement , nested if-statement, Comparison & Logical Operators

  source 1: https://harmash.com/java/java-conditions/if-else-statements.php
  source 2: https://harmash.com/java/java-operators/
*/

package Lectures;

import java.util.Scanner;

public class Lec03 {

	public static void main(String[] args) {
		boolean condition = false;
		
		if (condition) {
			// if condition is true
			System.out.println("Turn Right");			
		}
		else {
			// if condition is false
			System.out.println("Turn Left");
		}
		
		
		// EXAMPLE 1
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Number 1: ");
		int number1 = reader.nextInt();
		
		System.out.print("Number 2: ");
		int number2 = reader.nextInt();
		
		if(number1 == number2) {
			System.out.println("Number1 equal number2");
		}
		else if(number1 > number2) {
			System.out.println("Number1 is the greatest!");
		}
		else {
			System.out.println("Number2 is the greatest!");
		}
		
		
		// EXAMPLE 2
		
		System.out.print("Enter your grade: ");
		
		double grade;
		if (!reader.hasNextDouble()) // للتأكد من نوع المدخلات
			System.out.println("Error: You entered non number value!!");
		else {
			grade = reader.nextDouble();
			
			if(grade > 100 || grade < 0)
				System.out.println("Error: You entered a wrong number!!");
			
			else if(grade >= 90) 
				System.out.println("A");
			
			else if(grade >= 80)
				System.out.println("B");
			
			else if(grade >= 70)
				System.out.println("C");
			
			else if(grade >= 60)
				System.out.println("D");
			
			else 
				System.out.println("F");			
		}	
	}
}
