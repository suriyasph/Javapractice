package Thredpro;

class Atm {
	private int money = 10000;

	synchronized void withdraw(int money) {
		System.out.println("Ready to withdraw");
		if (this.money > money) {
			this.money -= money;

			System.out.println("Withdrawal sucessfull " + this.money);

		} else {
			System.out.println("less balance is your account");
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}

			this.money -= money;
			System.out.println("Withdrawal sucessfull " + this.money);
		}

	}

	synchronized void deposit(int money) {
		System.out.println("Your money is being deposited");
		this.money += money;
		notify();

	}

}

class callwithdraw extends Thread {
	Atm obj;

	callwithdraw(Atm obj) {
		this.obj = obj;
	}

	public void run() {
		obj.withdraw(1000);
	}
}

class calldeposit extends Thread {
	Atm obj;

	calldeposit(Atm obj) {
		this.obj = obj;
	}

	public void run() {
		obj.deposit(1000);
	}
}

public class intercom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm a = new Atm();
		callwithdraw w = new callwithdraw(a);
		calldeposit d = new calldeposit(a);
		w.start();
		d.start();

	}

}
