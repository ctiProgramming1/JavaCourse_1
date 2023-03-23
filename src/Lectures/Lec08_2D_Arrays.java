/* 
  Lecture 8: 2D Arrays
  
  source 1: https://harmash.com/java/java-arrays/
  source 2: https://www.w3schools.com/java/java_arrays.asp
  
*/
package Lectures;

public class Lec08_2D_Arrays {

	public static void main(String[] args) {

		// 1D Array
		String a[] ={"Khaled", "Ali", "Mohammed"};
		// 2D Array
		
		// creating 2d array
		String arr2d[][] = { {"Khaled", "Ali", "Mohammed"},
							 {"Riyadh", "Jeddah", "Arar", "Altaif"}};
		
		// creating 2d array with known size
		int arr3[][] = new int[4][7];
		
		System.out.println(arr2d[0][0]); // Khaled
		System.out.println(arr2d[1][0]); // Riyadh
		
		System.out.println(arr2d.length); // 
		System.out.println(arr2d[1].length); // 
		
		for(int i = 0; i < arr2d.length; i++)
			for(int j = 0; j < arr2d[i].length; j++)
				System.out.println(arr2d[i][j]);

		for(int i = 0; i < arr2d.length; i++) {
			for(int j = 0; j < arr2d[i].length; j++)
				System.out.print(arr2d[i][j] + "\t");
			System.out.println();
		}
		
		for(int i = 0; i < arr3.length; i++)
			for(int j = 0; j < arr3[i].length; j++)
				System.out.println(arr3[i][j]);
		
		int counter = 1;
		for(int i = 0; i < arr3.length; i++)
			for(int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = counter;
				counter++;
			}
		
		for(int i = 0; i < arr3.length; i++) {
			for(int j = 0; j < arr3[i].length; j++)
			System.out.print(arr3[i][j] + "\t");
		System.out.println();
		}
	}

}
