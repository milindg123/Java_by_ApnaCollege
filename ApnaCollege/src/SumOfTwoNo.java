import java.util.Scanner;

public class SumOfTwoNo {

	public static void main(String[] args) {
		
		
//		Code to calculate sum
		int a = 10;
		int b = 5;
		int sum = a+b;
		System.out.println(sum);
		
		
		System.out.println("\n\n\n");
		
		
//		From user input
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int p = sc.nextInt();
		System.out.println("Enter he second number: ");
		int q = sc.nextInt();
		int summ = p+q;
		System.out.println("Summation of two numbers are : ");
		System.out.println(summ);
	}

}
