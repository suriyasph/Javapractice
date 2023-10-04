package Hakerrank;

import java.util.Scanner;

public class anadram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1 = scan.next().toLowerCase();
		System.out.println("Enter the second string");
		String s2 = scan.next().toLowerCase();
		int count1 = 0, count2 = 0;
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				int c1 = s1.charAt(i);
				int c2 = s1.charAt(i);
				count1 += c1;
				count2 += c2;
			}
			System.out.println(count1);
			System.out.println(count2);

			if (count1 == count2)
				System.out.println("String is anagram");
			else
				System.out.println("String is not anagram");

		}
		else
			System.out.println("String is not anagram");
	}

}
