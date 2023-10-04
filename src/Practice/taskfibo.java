package Practice;

import java.util.Scanner;

public class taskfibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		int a = 0, b = 1, i = 2;
		System.out.print(a + " " + b + " ");
		while (i < n) {
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
			i++;
		}

	}

}
