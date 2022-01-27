package ArraysReview;

public class TimesFrom24To12 {
	
	static void printArrayNumbers(int[] arr) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
	}
	
	static void printArrayString(String[] arr) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
	}
	
	static int covertTo12(int n24) {
		if(n24 > 12)
			return (n24 - 12);
		else if(n24 == 0)
			return 12;
		else
			return n24;
	}
	
	static String hoursMinutes(String timeIn24) {
		int h = Integer.parseInt(timeIn24.substring(0, 2));
		h = covertTo12(h);
		int m = Integer.parseInt(timeIn24.substring(3, 5));
		
		String timeIn12 = h + ":" + m;
		return timeIn12;
	}
	
	static String[] to12(String[] timesIn24) {
		String[] timesIn12 = new String[timesIn24.length];
		for(int i = 0; i < timesIn24.length; i++) {
			int h = Integer.parseInt(timesIn24[i].substring(0, 2));
			h = covertTo12(h);
			int m = Integer.parseInt(timesIn24[i].substring(3, 5));
			
			timesIn12[i] = h + ":" + m;
		}
		
		return timesIn12;
	}
	
	

	public static void main(String[] args) {
	
		String[] times = {"12:30", "11:20", "16:50", "20:55"};

//		printArrayNumbers(hoursMinutes("00:50"));
		
		printArrayString(times);
		System.out.println();
		printArrayString(to12(times));
	}

}
