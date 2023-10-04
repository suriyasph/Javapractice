package Hakerrank;

import java.util.*;

//binary format of a number
public class Binarycon {
	static void funtion1(int n) {
		StringBuffer bi = new StringBuffer();
		while (n > 0) {
			bi.append(n % 2);
			n /= 2;
		}
		System.out.println(bi.reverse());
	}

	static void funtion2(int n) {
		String bi = "";
		while (n > 0) {
			bi += (n % 2);
			n /= 2;
		}
		for (int i = bi.length() - 1; i >= 0; i--)
			System.out.print(bi.charAt(i));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the number..");
		int n = ob.nextInt();
        System.out.println(Integer.toBinaryString(n));
		funtion1(n);
		funtion2(n);

	}

}
