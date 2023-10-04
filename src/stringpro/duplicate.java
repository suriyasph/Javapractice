package stringpro;

import java.util.Scanner;

public class duplicate {
	void dup(String s) {
		char ch = ' ', ch2 = ' ';
		int k = 0;
		for (int i = 0; i < s.length(); i++) {
			int c = 0;
			for (int j = 0; j < s.length(); j++) {

				ch = s.charAt(i);
				ch2 = s.charAt(j);

				if (ch == ch2) {
					c++;
					k++;
				}

			}
			i = k;
			System.out.println(ch + " " + c);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the name");
		String s = ob.nextLine();
		duplicate d = new duplicate();
		d.dup(s);

	}

}
