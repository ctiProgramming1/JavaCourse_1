
public class Lab04 {

	public static void main(String[] args) {

		String products[] = {"Mobile", "PC", "Labtop",
							  "Pen", "Remote", "TV"};
		double prices[] = {2000,1500,3000,10,25,1000};
		
		int cheapest = 0;
		
		for(int i = 1; i < products.length; i++) {
			if(prices[i] < prices[cheapest])
				cheapest = i;
		}
		/*
		cheapest=0: prices[1] < prices[0]
		cheapest=1: prices[2] < prices[1]
		cheapest=1: prices[3] < prices[1]
		cheapest=3: prices[4] < prices[3]
		cheapest=3: prices[5] < prices[3] 
		*/
		
		System.out.println(products[cheapest]);
	}

}
