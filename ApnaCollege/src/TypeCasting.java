
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
		float a = 25.12f;
		
		int b =(int) a;  //Typecasting :-also called narrowing, explicit conversioning
		
		System.out.println(b);
		
		float marks = 99.999f;
		int marks2 = (int) marks;
		System.out.println(marks2);
		
		
		char ch = 'a';
		char ch2 = 'b';
		int number = ch;
		int number2 = ch2;
		System.out.println(number);
		System.out.println(number2);
	}

}
