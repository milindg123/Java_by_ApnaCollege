import java.util.Scanner;

public class JavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!\n");
		
		int $ =25;
		System.out.println($);
		
		
		
//	**************	COMMENTS ******************
		
//		Comments are the parts of code that will not execute but can explain the code logic
		
//		There are two types of comments
		
//		1. Single line comments (//)
		
//		2. Multiple line comments (/*      */)
		
		
		
		
//		************Input taken in Java ************************
		
		System.out.println("Input taken in the Java\n\n");
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(input);
		
		int number = sc.nextInt();
		System.out.println(number);
		
		float price = sc.nextFloat();
		System.out.println(price);
		
		byte b = sc.nextByte();
		System.out.println(b);
		
		String fname = sc.nextLine();
		System.out.println(fname);
		
		
	}

}
