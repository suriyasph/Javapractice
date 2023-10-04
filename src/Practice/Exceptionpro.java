package Practice;

import java.util.*;

public class Exceptionpro {
	int a, b;

	void in() {
		Scanner ob = new Scanner(System.in);

		try {

			System.out.println("Enter the 1st value..");
			a = ob.nextInt();
			System.out.println("Enter the 2nd value");
			b = ob.nextInt();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Enter the correct vslue");
			in();
		}

	}

	void display() {
		System.out.println(a + b);
	}

	Exceptionpro() {
		in();
		display();
	}

	public static void main(String[] args) {
		Exceptionpro n = new Exceptionpro();

	}
}
