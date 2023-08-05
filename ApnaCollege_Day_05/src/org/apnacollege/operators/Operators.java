package org.apnacollege.operators;
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************* Arithmetic Operators: *********** ");
		System.out.println("\n");
		System.out.println("1. Binary Arithmetic Operators:");
		int A = 10;
		int B = 5;
		System.out.println("Add = " + (A+B));
		System.out.println("Substract = " + (A-B));
		System.out.println("Multiplication = " + (A*B));
		System.out.println("Division = " + (A/B));
		System.out.println("Modulo = " + (A%B));
		
		
		
		System.out.println("\n\n******************************");
		System.out.println("2. Unary Arithmetic Operators: ");
		
		
		/* a = a+1      ++   increment operator   
		 * a = a-1      --   decrement operators
		 * 
		 * Pre Increment ----> ++a  --> before --> 1. value change 2. value use
		 * Post Increment ---> a++  --> After  --> 1. value use    2. value change 
		 */
//		*********** Example of Pre Increment ***********************
		System.out.println("\n************ Example of Pre Increment ******************");
		int a = 10;
		int b = ++a;
		System.out.println(a);
		System.out.println(b);
		
		
//		*********** Example of Post Increment **********************
		System.out.println("\n\n************ Example of Post Increment******************");
		int p = 10;
		int q = a++;
		System.out.println(p);
		System.out.println(q);
		
		
		System.out.println("\n\n ********** Decrement Operaters: *******");
		System.out.println("\n************ Example of Pre Decrement******************");
		int x = 10;
		int y = --x;
		System.out.println(x);
		System.out.println(y);
	}

}

