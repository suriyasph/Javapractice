package Hakerrank;

import java.util.*;

public class anagram2 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner ob = new Scanner(System.in);
		String s1 = ob.nextLine().toLowerCase();
		String s2 = ob.nextLine().toLowerCase();
		int c = 0, c1 = 0, co = 0, count1 = 0, count2 = 0;
		if (s1.length() == s2.length()) {
			for (char i = 'a'; i <= 'z'; i++) {
				for (int j = 0; j < s1.length(); j++) {
					if (i == s1.charAt(j)) {
						c++;
					}
				}
				for (int k = 0; k < s2.length(); k++) {
					if (i == s2.charAt(k)) {
						c1++;
					}

				}
				if (c == c1) {
					count1 += c;
					count2 += c1;
				} else {
					count1 = c + c1;
					count2=c+c1;
					;
				}
				c = 0;
				c1 = 0;

			}

			if (count1 == count2)
				System.out.println("Anagrams");
			else
				System.out.println("Not Anagrams");
		} else {
			System.out.println("Not Anagrams");

		}
	}
}
