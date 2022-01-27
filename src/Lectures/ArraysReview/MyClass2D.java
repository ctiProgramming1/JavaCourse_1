package ArraysReview;

public class MyClass2D {

	public static void main(String[] args) {
		int[][] t = {   {18,19,22,23,20,15,10,4,6,7},
						{12,15,18,25,26,24,23} };
		
		for(int i = 0; i < t.length; i++) {
			for(int j = 0; j < t[i].length; j++)
				System.out.print(t[i][j] + "\t");
			System.out.println();
		}
	}

}
