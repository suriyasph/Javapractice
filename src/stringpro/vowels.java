package stringpro;

import java.util.*;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the name");
		String s = ob.nextLine();
		char v[] = { 'a', 'e', 'i', 'o', 'u' };
		for (int i = 0; i < v.length; i++) {
			int c = 0;
			for (int j = 0; j < s.length(); j++) {
				char ch = s.charAt(j);
				if (v[i] == ch) {
					c++;
				}

			}
			if(c>0)
			System.out.println(v[i]+"="+c);

		}

	}

}
