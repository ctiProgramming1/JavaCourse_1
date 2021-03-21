/* 
  Lecture 6: Loops: for loop, for-in loop, while loop, do while loop and break/continue
  
  source: https://harmash.com/java/java-loops/
*/

package Lectures;

import java.util.Scanner;

public class Lec06 {

	public static void main(String[] args) throws InterruptedException{
		
				
		// for loop
		
		String name = "Ali";
//		
		for(int i = 1; i<=10; i++)
			System.out.print(name + i + " ");
		
		for(int i = 0; i<=10; i = i + 2)
			System.out.print(i + " ");		
		
		// while loop
		
		int i = 0;
		
		while(i<=5)
		{
			System.out.println(i);
			i++;
		}
		
		
		int i = 10;
		
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}
		
		// do while loop
		
		int i = 1;
		
		do{
			System.out.print(i + " ");
			i++;
		}
		while(i<=10);
		
		
		
		// nested loop
		
	
		for(int i = 1; i<=3; i++)
		{
			System.out.println(i + ": ");
			for(int j = 1; j<=5; j++)
				System.out.print(j + " ");
			
			System.out.println();
		}
		
		
		// EXAMPLE 1
		
		for(int i = 1; i<=10; i++)
		{
			for(int j = 1; j<=10; j++)
				System.out.print(i*j + "\t");
			System.out.println();
		}
		
		
		// break 
		
		for(int i = 0; i<=10; i = i + 2)
		{
			System.out.print(i + " ");
			if(i == 6)
				break;
		}
		
		// continue
		
		for(int i = 1; i<=10; i++)
		{
			if(i == 6)
				continue;
			System.out.print(i + " ");			
		}
		
		
		
		// The issue of infinite loop مشكلة الحلقة اللا نهائية
		for(int i = 1; i>0; i++) {
			System.out.print(i + " ");
			Thread.sleep(500);
		}
		
		while(true) {
			System.out.print("Hi ");
			Thread.sleep(1000); // انتظر ثانية
		}
			
		// Closing Scanner
		
		// EXAMPLE 2
		
		Scanner r = new Scanner(System.in);
		
		int score = 0, n = 5;		

		for (int i = 0; i < n; i++) {
			int n1 = (int) (Math.random() * 9) + 1;
			int n2 = (int) (Math.random() * 9) + 1;
			System.out.print(n1 + " + " + n2 + " = ");
			int answer = r.nextInt();
			
			if(answer == (n1 + n2))
				score++;
		}
		
		System.out.println("Your score is " + score + " of " + n);
		
		// You should close the scanner every time you use it
		r.close();

	}

}
