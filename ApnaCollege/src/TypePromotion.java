
public class TypePromotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 'a';
		char b = 'b';
		System.out.println((int)(a));
		System.out.println((int)(b));
		System.out.println(a);
		System.out.println(b-a);
//		
////		char c = b-a;  we cannot conver int to char
//		
		short p = 5;
		byte q = 35;
		char c ='c';
		byte bt =(byte)(p+q+c);
		System.out.println(bt);
//		
//		
//		
//		// Rule no.2 
//		// long, float, double whole expression is promoted to long, float, double
//		
		int x = 10;
		float y = 20.25f;
		long z = 25;
		double d = 30;
		double ans = a + b + c + d;
		System.out.println(ans);
		
		
		
//		Exmaple of type promotion
		
		byte m = 5;
		byte n = (byte)(m*2);
		System.out.println(n);
		
		
	}

}
