/* 
  Lecture 8: Methods
  
  source 1: https://harmash.com/java/java-methods/
  source 2: https://www.w3schools.com/java/java_methods.asp

*/
package Lectures;

public class Lec09 {
	
	// Simple method 1
	void greeting()
	{
		System.out.println("Hello from greeting method");
	}

	// Simple static method 2
	static void  greeting2()
	{
		System.out.println("Hello from the static greeting2 method");
	}

	// Method 3: take 2 input numbers and output the sum
	static int  add(int a, int b)
	{
		return (a+b);
	}
	
	// Method 4: take 1 input number and output the factorial
	static int factorial(int n)
	{
		int factorial = 1;
		for(int i=2; i<=n; i++)
			factorial = factorial * i;
		
		return factorial;
	}

	public static void main(String[] args) {
		
		// create an object
		Lec09 obj = new Lec09();
		
		// calling the object method
		obj.greeting();
		
		// calling the static method
		greeting2();
		
		// using the add method
		System.out.println(add(3,6));
		
		// using the factorial method
		System.out.println(factorial(5));		
	}
}