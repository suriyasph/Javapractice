package Thredpro;

import java.util.Scanner;

public class Bank {
	int money = 1000;

	synchronized void withdraw(int a) {
		if (money >= a) {
			System.out.println("Received cash");
		} else {
			System.out.println("Add more cash to Withdraw");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
			if (money >= a) {
				money -= a;
				System.out.println("your amount is received \n" + " current Balance is :" + money);
			} else {
				System.out.println("remove your card");
			}
		}
	}

	synchronized void deposit() {
		System.out.println("do you want to continue");
		Scanner obj = new Scanner(System.in);
		char ab = obj.next().charAt(0);
		if (ab == 'y' || ab == 'Y' || ab == 's' || ab == 'S') {
			System.out.println("Enter the amount you need to deposit");
			money += obj.nextInt();
			notify();

		} else {
			System.out.println("thank and visit again");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank Bk = new Bank();
		Thread obj = new Thread() {
			public void run() {
				Bk.withdraw(200);
			}
		};
		Thread obj1 = new Thread() {
			public void run() {
				Bk.deposit();
			}
		};
		obj.start();
		obj1.start();
        System.out.println(obj.getClass());
	}
}