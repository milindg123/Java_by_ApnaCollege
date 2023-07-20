import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		float rad = sc.nextInt();
		
		System.out.println("Area of Circle is : ");
		float Area= (3.14f * rad * rad);
		System.out.println(Area);
		
		

	}

}
