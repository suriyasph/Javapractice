package Hakerrank;

import java.util.*;

public class anagram {
	static void ana(String s1, String s2) {
		int co = 0;
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				char c = s1.charAt(i);
				for (int j = 0; j < s2.length(); j++) {
					if (c == s2.charAt(j)) {
						co++;
					}
				}

			}
		}
		if (co == s1.length()) {
			System.out.println("String is anagram");
		} else
			System.out.println("String is not anagram");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1 = ob.nextLine();
		System.out.println("Enter the second string");
		String s2 = ob.nextLine();
		ana(s1, s2);

	}

}
