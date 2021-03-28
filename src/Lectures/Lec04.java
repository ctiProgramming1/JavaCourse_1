/* 
  Lecture 4: Casting Types, Generate Random Numbers, String class
  
  source 1: https://www.w3schools.com/java/java_type_casting.asp
  source 2: https://harmash.com/java/java-numbers/math-random.php
  source 3: https://harmash.com/java/java-strings/
*/

package Lectures;

import java.math.*;

public class Lec04 {

	public static void main(String[] args) {

		// Casting types تحويل المتغير من نوع الى نوع آخر
		
		double number1 = 9.87;
		
		int number2 = (int) number1; // manual casting
		
		double number3 =  number2; // automatic casting
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		
		
		// Casting String to int تحويل (النص المحتوي على رقم صحيح) الى رقم صحيح
		String a = "23";
		int n1 = Integer.parseInt(a);
		System.out.println(n1);
		
		// Casting String to double تحويل (النص المحتوي على رقم كسري) الى رقم كسري
		String b = "3.5";
		double n2 = Double.parseDouble(b);
		System.out.println(n2);
		
		Double.parseDouble("1.5");
		Integer.parseInt("66");
		

	
		
		// Random numbers انشاء ارقام عشوائية
	
		// لإنشاء رقم عشوائي من 0 الى 1
		System.out.println(Math.random());
		
		// لإنشاء رقم عشوائي من 0 الى 100
		int randomNumber1 = (int) (Math.random() * 100);		
		System.out.println(randomNumber1);

		// Random number between min and max
		// (int) ((Math.random() * (max - min)) + min
		// Random number between 80 and 100 
		int randomNumber2 = (int) (Math.random() * (100 - 80)) + 80;		
		System.out.println(randomNumber2);

		
		// String manipulations التعامل مع النصوص
		
		String name = "Khaled Alyousefi";
		
		System.out.println("The name length is: " + name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.charAt(7)); // الحرف الثامن
		System.out.println(name.indexOf("you")); // اذا النتيجة 1- فيعني أن النص غير موجود
		System.out.println(name.concat(" is here")); // equal to (name + " is here")
		System.out.println(name.contains("ed"));
		System.out.println(name.substring(7)); // get the string from 7 
		System.out.println(name.substring(7, 12));// get the string from 7 to 11
		System.out.println(name.replace('e', 'i'));
		System.out.println(name.startsWith("Khal"));
		System.out.println(name.endsWith("e"));
		System.out.println(name.equals("khaled Alyousefi"));
		System.out.println(name.equalsIgnoreCase("khaled Alyousefi"));
		System.out.println(name.trim()); // حذف المسافات في بداية ونهاية النص		

	}
}