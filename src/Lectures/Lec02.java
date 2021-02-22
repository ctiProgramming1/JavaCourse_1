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
		System.out.println(Math.PI); 
		System.out.println(Math.pow(a, b)); 
		System.out.println(Math.round(8.65)); 
		System.out.println(Math.round(8.659857*100)/ 100.0); 
		System.out.println(Math.sqrt(9)); 
		System.out.println(Math.abs(-12)); 
		
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
		String name = reader.nextLine();
		System.out.print("Hello, " + name);
		
		System.out.print("Enter the circle radius: ");
		radius = reader.nextDouble();
		circleArea = Math.PI * Math.pow(radius, 2);
		System.out.println("The area of the circle is " + circleArea);

		int number1 = reader.nextInt(); //int لقراءة بيانات من نوع 
		double number2  = reader.nextDouble(); //double لقراءة بيانات من نوع 
		String text  = reader.nextLine(); //String لقراءة بيانات من نوع 
	}

}
