package Excep;

import java.util.*;

final class IllegalNameException extends Throwable {

	IllegalNameException(String s) {
		super(s);
	}

}

final class IllegalMobileNumber extends Throwable {

	IllegalMobileNumber(String s) {
		super(s);
	}
}

final class IllegalPassword extends Throwable {

	IllegalPassword(String s) {
		super(s);
	}
}

public class Euser {
	String name;
	long mobilenumber;
	String password;

	Euser() {
		inputname();
		inputmobilenumber();
		inputpassword();
		display();
	}

	void check(String name) throws IllegalNameException {
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (Character.isUpperCase(c)) { 
				throw new IllegalNameException("Enter the vaild name");
			}

		}
	} 

	void checknumber(long mobilenumber) throws IllegalMobileNumber {
		int c = 0;
		while (mobilenumber > 0) {
			c++;
			mobilenumber /= 10;

		}
		if (c != 10) {
			throw new IllegalMobileNumber("Enter the vaild mobile number");

		}
	}

	void checkpassword(String password) throws IllegalPassword {
		if (password.length() < 8) {
			throw new IllegalPassword("Enter the vaild password");

		}
	}

	void inputname() {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the name");
		name = ob.nextLine();
		try {
			check(name);
		} catch (IllegalNameException e) {
			System.out.println(e);
			inputname();
		}
	}

	void inputmobilenumber() {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the mobile number");
		mobilenumber = ob.nextLong();
		ob.nextLine();
		try {
			checknumber(mobilenumber);
		} catch (IllegalMobileNumber e) {
			System.out.println(e);
			inputmobilenumber();
		}
	}

	void inputpassword() {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the password");
		password = ob.nextLine();
		try {
			checkpassword(password);
		} catch (IllegalPassword e) {
			System.out.println(e);
			inputpassword();
		}
	}

	void display() {
		System.out.println(name);
		System.out.println(mobilenumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Euser e = new Euser();

	}

}
   