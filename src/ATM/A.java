package ATM;

import java.util.Scanner;

class B {
	Scanner s = new Scanner(System.in);
	String name, ac_no;
	int pin, amt;

	void details() {
		System.out.print("Enter your name..");
		name = s.nextLine();
		System.out.print("Enter your account number..");
		ac_no = s.nextLine();
		System.out.print("Enter your pinnumber..");
		pin = s.nextInt();
		System.out.print("Enter your amount..");
		amt = s.nextInt();
	}

	void pin() {
		int pins = 1234;

		try {
			Scanner s1 = new Scanner(System.in);
			pin = s1.nextInt();
			if (pins == pin) {
				am();
			} else {
				System.out.println("Wrong pin");
				System.out.println("Please re-enter the pin");
				pin();
			}
		} catch (Exception w) {

			System.out.println(w);
			System.out.println("Please re-enter the pin");
			pin();

		}    

	}

	void am() {
		System.out.print("Enter your amount..");
		amt = s.nextInt();
	}

	void con() {
		System.out.println("Do you want to continue..");
		String c = s.next();
		if (c.equals("yes")) {
			fun();
		} else {
			System.out.println("Thank you.........");
		}
	}

	void fun() {
		System.out.println("1.Widthdraw");
		System.out.println("2.Deposit");
		System.out.println("3.Balance");
		System.out.println("4.Exit");
		System.out.println("Enter your option...");
		int a = s.nextInt();
		switch (a) {
		case 1:
			System.out.println("Enter widthdraw amount");
			int w_a = s.nextInt();
			if (w_a < amt) {
				System.out.println("Collect your amount ");
				amt -= w_a;
				con();
				break;
			} else {
				System.out.println("Amount not avalable");
				con();
				break;
			}

		case 2:
			System.out.println("Enter deposit amount...");
			int d_a = s.nextInt();
			amt += d_a;
			con();
			break;
		case 3:
			System.out.println("Hi" + name);
			System.out.println("your balance is" + amt);
			con();
			break;
		case 4:
			System.out.println(" Thank you");
			break;
		default:
			System.out.println("Error");

		}

	}
}

public class A extends B {

	public static void main(String[] args) {
		A ob = new A();
		// System.out.println("WELCOME TO ATM");
		// System.out.println("INSERT YUOR CARD");
		System.out.println("Enter your pinnumber..");
		ob.pin();
		ob.fun();
		


	}

}
