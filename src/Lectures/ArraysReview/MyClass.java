package ArraysReview;

public class MyClass {

	public static void main(String[] args) {

//		int[] numbers = new int[5];
		int[] numbers = {1,2,3,4,5,6,7};
		
		for(int n:numbers)
			System.out.print(n + "\t");
		
		System.out.println();
		for(int i = 0; i < numbers.length; i++)
			numbers[i] += 5;
		


	}

}
