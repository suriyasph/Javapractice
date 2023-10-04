package Excep;

import java.util.*;

public class exdemo {
	static String name = null;
	static String name1;

	void fun(String name, String name1) {
		if (name.equals(name1)) {
			System.out.println("Success");
		} else {
			System.out.println("Unsuccess");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exdemo e = new exdemo();
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the name");
		name1 = ob.next();
		try {
			e.fun(name, name1);
		} catch (Exception s) {
			System.out.println(s);
			name = name1;
			System.out.println("Re-Enter the name");
			String name1 = ob.next();
			e.fun(name, name1);
		}
	}

}
