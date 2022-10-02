/* 
  Lecture 2: Math library and Scanner class(read user's input)

  source 1: https://harmash.com/tutorials/java/numbers
  source 2: https://harmash.com/tutorials/java/user-inputs
*/

package Lectures;

import java.math.*;
import java.util.Scanner;

public class Lec02 {

	public static void main(String[] args) {
		
		int a; // declaration
		a = 8; // initialization
		
		int b = 2; // declaration and initialization
		
		// العمليات الحسابية الأساسية
		System.out.println(a+b); // جمع
		System.out.println(a-b); // طرح
		System.out.println(a*b); // ضرب
		System.out.println(a/b); // قسمة
		System.out.println(a%b); // باقي القسمة

		// الدوال الرياضية
		System.out.println(Math.max(a,b)); // القيمة الأكبر بين عددين
		System.out.println(Math.min(a,b)); // القيمة الأصغر بين عددين
		System.out.println(Math.sin(180)); 
		System.out.println(Math.PI); // 𝜋
		System.out.println(Math.pow(a, 2)); // a²
		System.out.println(Math.round(8.65)); // تقريب الى أقرب رقم صحيح
		System.out.println(Math.round(8.659857*100)/ 100.0); // تقريب رقم كسري الى خانتين بعد الفاصلة
		System.out.println(Math.sqrt(9)); // الجذر التربيعي
		System.out.println(Math.abs(-12)); // القيمة المطلقة
		
		// find the area of a square
		double length = 8.0;
		double squareArea = Math.pow(length, 2);
		System.out.println("The area of the square is " + squareArea);

		// find the area of a circle
		double radius = 4.5;
		double circleArea = Math.PI * Math.pow(radius, 2);
		System.out.println("The area of the circle is " + circleArea);
		
		// قراءة البيانات من المستخدم
		Scanner reader = new Scanner (System.in);
		System.out.print("Please Enter your name: ");
		String name = reader.nextLine(); // قراءة نص
		System.out.print("Hello, " + name);
		
		System.out.print("Enter the circle radius: ");
		radius = reader.nextDouble(); // قراءة رقم
		circleArea = Math.PI * Math.pow(radius, 2);
		System.out.println("The area of the circle is " + circleArea);

		int number1 = reader.nextInt(); //int لقراءة بيانات من نوع 
		double number2  = reader.nextDouble(); //double لقراءة بيانات من نوع 
		String text1  = reader.nextLine(); //String لقراءة بيانات من نوع 
	}
}
