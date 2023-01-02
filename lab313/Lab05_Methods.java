package lab313;

public class Lab05_Methods {
	
	protected static void print_name(String name) {
		System.out.println(name);
	}
	
	void greeting(){
		System.out.println("Hello from greeting method");
	}
	
	static int add(int a, int b)
	{
		int c = 66;
		return (a+b);
	}
	
	static int factorial(int n)
	{
		int factorial = 1;
		for(int i=2; i<=n; i++)
			factorial = factorial * i;
		
		return factorial;
	}
	
	public static void main(String[] args) {
		
		print_name("Khaled");
		print_name("Ali");
//		
//		Lab05_Methods obj = new Lab05_Methods();		
//		obj.greeting();
//		
		
//		System.out.println(add(8,9));
		
		
//		System.out.println(factorial(5));

	}

	
	
}
