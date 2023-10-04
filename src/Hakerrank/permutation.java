package Hakerrank;

import java.util.*;

public class permutation {
	static int fact(int l) {
		if (l == 0)
			return 1;
		else
			return l * fact(l - 1);

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string....");
		String st = s.next();
		int l = st.length();
		System.out.println("enter the combination..");
		int c = s.nextInt();
		int a = (fact(l) / fact(l - c));
		System.out.println(a);

	}

}
