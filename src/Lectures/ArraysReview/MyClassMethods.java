package ArraysReview;

public class MyClassMethods {
	
	static void validation(String[] names) {
		int valid = 0;
		
		for(int i = 0; i < names.length; i++)
			if(names[i].length() > 1)
				valid++;

		System.out.println("There are " + valid + " valid names of " + names.length);
	}
	
	static String[] numberToText(int[] n) {
		String[] t = new String[n.length];
		
		for(int i = 0; i < n.length; i++) {
			if(n[i] == 1)
				t[i] = "One";
			else if(n[i] == 2)
				t[i] = "Two";
			else if(n[i] == 3)
				t[i] = "Three";
			else if(n[i] == 4)
				t[i] = "Four";
			else if(n[i] == 5)
				t[i] = "Five";
			else if(n[i] == 6)
				t[i] = "Six";
			else if(n[i] == 7)
				t[i] = "Seven";
			else if(n[i] == 8)
				t[i] = "Eight";
			else if(n[i] == 9)
				t[i] = "Nine";
		}
		
		return t;
	}

	static void printArrayNumbers(int[] arr) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
	}
	
	static void printArrayString(String[] arr) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
	}

	
	public static void main(String[] args) {
//		String[] names = {"Ali", "Khaled", "Fahad", "Saad", "t", "ray"};
//		
//		validation(names);
		
		int[] n = {1,3,5,6,7,9,7,6,2};
		
		printArrayNumbers(n);
		
		System.out.println();
		
		String[] t = numberToText(n);
		
		printArrayString(t);

	}

}
