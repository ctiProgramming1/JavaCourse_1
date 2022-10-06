/* 
  Lecture 5: Ternary Operator, Assignment Operators, Switch
 
  source 1: https://harmash.com/tutorials/java/operators/others
  source 2: https://harmash.com/tutorials/java/operators
  source 3: https://harmash.com/tutorials/java/conditions/switch
*/

package Lectures;

public class Lec05 {

	public static void main(String[] args) {
	
		
		// Ternary Operator
		
		int n1 = (true) ? 1 : 2;		
		System.out.println(n1);
		
		String s1 = (false) ? "Hi" : "Bye";
		System.out.println(s1);
		
		String s2 = (n1 == 1) ? "First" : "Not first";
		System.out.println(s2);
		
		System.out.println((n1 == 1) ? "First" : "Not first");

		// Assignment Operators
//		a++		:	a = a + 1
//		a--		:	a = a - 1
//		a += b	:	a = a + b
//		a -= b	:	a = a - b
//		a *= b	:	a = a * b
//		a /= b	:	a = a / b
		
		int a = 1, b = 2, c = 3;
		
		System.out.println(a);		
		a++;
		System.out.println(a);
		
		a--;
		System.out.println(a);
		
		a += b;
		System.out.println(a);		
		
		a -= b;
		System.out.println(a);
		
		a *= b;
		System.out.println(a);
		
		a /= b;
		System.out.println(a);
		
		double d = 1.0 , e = 2.0;
		
		d /= e;
		System.out.println(d);		
		
		// switch
		
		int x = 0;		
		switch (x) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("x != 0 or 1 or 2 or 3");				
		}

  
//		
//		//  EXAMPLE 1
        char grade = 'F';
        
        switch(grade){
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        	System.out.println("You have passed!");
        	break;
        case 'F':
        	System.out.println("You have not passed!");
        	break;
        default:
        	System.out.println("Unknown!");        	
        }
                
        //  EXAMPLE 2
        switch(grade){
        case 'A', 'B', 'C', 'D':
        	System.out.println("You have passed!");
        	break;
        case 'F':
        	System.out.println("You have not passed!");
        	break;
        default:
        	System.out.println("Unknown!");       	
        }		
	}
}
