package Hakerrank;

public class practice1 {
	int a = 5;
	static int b = 10;
	final int c=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice1 p1 = new practice1();
		practice1 p2 = new practice1();
		practice1 p3 = new practice1();
		System.out.println(p1.a);
		System.out.println(p2.a);
		System.out.println(p3.a);
		p2.a = 20;
		p3.a = 30;
		System.out.println(p1.a);
		System.out.println(p2.a);
		System.out.println(p3.a);
		System.out.println(p1.b);
		System.out.println(p1.b);
		System.out.println(p1.c);
		System.out.println(p2.c);

	}

}
