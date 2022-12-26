import java.util.Scanner;

public class Lab02_Solution {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter a formula: ");
		String equation = reader.nextLine();
		
		int plus = equation.indexOf("+");

		int number1 = Integer.parseInt(equation.substring(0,plus));
		int number2 = Integer.parseInt(equation.substring(plus+1));
		
		System.out.println(equation + "=" + (number1 + number2));
		
		
		reader.close();
		

	}

}
