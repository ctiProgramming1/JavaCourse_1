package Lectures;

/* 
	Lecture 1: Data Types and Variables
	source 1: https://harmash.com/java/java-basic-data-types/
	source 2: https://harmash.com/java/java-variables-type/
 
*/

public class Lec01 {

	public static void main(String[] args) {
		// This is the first lecture
		
		// Primitive data types
		int numberOfStudents = 70;	// declaration
		numberOfStudents = 90;	// initialization
		
		int b = 2; // declaration and initialization
		
		// الأرقام
		byte number1 = 32; // عدد صحيح يتألف من 8 بت
		short number2 = 43; // عدد صحيح يتألف من 16 بت
		int number3 = 1500; // عدد صحيح يتألف من 32 بت
		long number4 = 29098; // عدد صحيح يتألف من 64 بت
		float number5 = 54.5f; // عدد كسري يتألف من 32 بت
		double number6 = 3898.1234; // عدد كسري يتألف من 64 بت
		
		char gradeLetter = 'B'; // رمز
		boolean isPassed = true; //  true / false
		
		// Object data types
		String name = "Ali";
		
		System.out.println("The number is " + numberOfStudents);
		
		System.out.println(name + " has a grade of " + gradeLetter);
		System.out.println(number1/2);					

	}

}
