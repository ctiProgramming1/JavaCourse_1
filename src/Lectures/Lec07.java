/* 
  Lecture 7: Arrays المصفوفات
  
  source 1: https://harmash.com/java/java-arrays/
  source 2: https://www.w3schools.com/java/java_arrays.asp
*/

package Lectures;

import java.util.Arrays;
import java.util.Scanner;

public class Lec07 {

	public static void main(String[] args) {
		
		// Creating an array
		
		String products1[]; // declaration
		
		products1 = new String[5]; // fill the array with default values
		
		// declare and fill the array with values
		String products[] = {"Mobile", "PC", "tablet", "charger", "CD", "cable", "screen"};
		
		
		// Access array's elements		
		System.out.println(products[0]);
		System.out.println(products[4]);
		System.out.println(products[7]); // out of bound error
		
		// get the array's length
		System.out.println(products.length);
		
		// Loop through all items in the array
		for(int i = 0; i < products.length; i++)
			System.out.println(products[i]);
		
		// change values
		System.out.println(products[4]);
		
		products[4] = "DVD";
		
		System.out.println(products[4]);
		
		// Example 1
		
		int numbers[] = new int[5];
		
		for(int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);
		
		// fill an array
		Arrays.fill(numbers, 2);
		
		for(int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);
		
		
		// Example 2
		int numbers[] = new int[10];
//		
		// تغيير قيم عناصر المصفوفة
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = i + 1;
		
		for(int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
		
		// Example 3
		int numbers[] = new int[5];
		
		Scanner reader = new Scanner(System.in);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print("Enter number " + (i+1) + ":");
			numbers[i] = reader.nextInt();	
		}
//		
//		// ترتيب عناصر المصفوفة تصاعدياً
		Arrays.sort(numbers);
		
		for(int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
		
		reader.close();
		
//		
//		// for-in loop
		
		int numbers[] = {2,5,88,44,99,567,6,7};
		
		Arrays.sort(numbers);
	
		for(int element: numbers)
			System.out.println(element);
		
		// Example 4
		
		Scanner r = new Scanner(System.in);
		
		System.out.print("How many names you have: ");
		int s = r.nextInt();
		
		String names[] = new String[s];
		
		for(int index = 0; index < names.length; index++) {
			System.out.print("Name " + (index+1) + ": ");
			names[index] = r.next();
		}
						
		Arrays.sort(names);
		
		for(String name:names)
			System.out.print(name + " ");
		

		r.close();
	
	}

}
