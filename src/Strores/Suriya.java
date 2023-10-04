package Strores;

import java.util.Scanner;

class Catagory {
	Scanner o = new Scanner(System.in);
	int price = 0;

	void pricecalc(int p) {
		System.out.println("Enter th quantity..");
		int n = o.nextInt();
		price += p * n;
		cont();
	}

	void bill() {
		System.out.println("Total Price.." + price);
	}

	void cont() {
		System.out.println("Want to continue the purchase..");
		char s = o.next().charAt(0);
		if (s == 'y')
			lift();
		else
			bill();

	}

	void home() {
		System.out.println("1.TV");
		System.out.println("2.AC");
		int op = o.nextInt();
		switch (op) {
		case 1:
			pricecalc(10000);
			break;
		case 2:
			pricecalc(12000);
			break;

		}

	}

	void chocolate() {
		System.out.println("1.DIARY MILK");
		System.out.println("2.SNIKERS");
		int op = o.nextInt();
		switch (op) {
		case 1:
			pricecalc(10);
			break;
		case 2:
			pricecalc(20);
			break;

		}

	}

	void biscuts() {
		System.out.println("1.OREO");
		System.out.println("2.GOOD DAY");
		int op = o.nextInt();
		switch (op) {
		case 1:
			pricecalc(10);
			break;
		case 2:
			pricecalc(25);
			break;

		}

	}

	void toys() {
		System.out.println("1.CARS");
		System.out.println("2.BAT");
		int op = o.nextInt();
		switch (op) {
		case 1:
			pricecalc(100);
			break;
		case 2:
			pricecalc(900);
			break;

		}

	}

	void juice() {
		System.out.println("1.APPLE");
		System.out.println("2.KIWI");
		int op = o.nextInt();
		switch (op) {
		case 1:
			pricecalc(50);
			break;
		case 2:
			pricecalc(40);
			break;

		}

	}

	void chinese() {
		System.out.println("1.Fried rice");
		System.out.println("2.Noodels");
		int op = o.nextInt();
		switch (op) {
		case 1:
			pricecalc(150);
			break;
		case 2:
			pricecalc(120);
			break;

		}

	}

	void indian() {
		System.out.println("1.Meals");
		System.out.println("2.Biriyani");
		int op = o.nextInt();
		switch (op) {
		case 1:
			pricecalc(120);
			break;
		case 2:
			pricecalc(170);
			break;

		}

	}

	void men() {
		System.out.println("1.Shirt");
		System.out.println("2.Phants");
		int op = o.nextInt();
		switch (op) {
		case 1:
			pricecalc(1000);
			break;
		case 2:
			pricecalc(1500);
			break;

		}

	}

	void women() {
		System.out.println("1.Saree");
		System.out.println("2.Churidar");
		int op = o.nextInt();
		switch (op) {
		case 1:
			pricecalc(2000);
			break;
		case 2:
			pricecalc(1500);
			break;

		}

	}

	void kids() {
		System.out.println("1.Boy");
		System.out.println("2.Girl");
		int op = o.nextInt();
		switch (op) {
		case 1:
			pricecalc(800);
			break;
		case 2:
			pricecalc(600);
			break;

		}

	}

	void ground() {
		System.out.println("1.Billing");
		System.out.println("2.Home Appliances");
		int op = o.nextInt();
		switch (op) {
		case 1:
			bill();
			break;
		case 2:
			home();
			break;

		}
	}

	void gold() {
		System.out.println("1.Chain");
		System.out.println("2.Ring");
		int op = o.nextInt();
		switch (op) {
		case 1:
			pricecalc(50000);
			break;
		case 2:
			pricecalc(34000);
			break;

		}

	}

	void silver() {
		System.out.println("1.Chain");
		System.out.println("2.Ring");
		System.out.println("3.Bracelet");
		int op = o.nextInt();
		switch (op) {
		case 1:
			pricecalc(10000);
			break;
		case 2:
			pricecalc(2500);
			break;
		case 3:
			pricecalc(6000);
			break;

		}

	}

	void first() {
		System.out.println("1.Chocolte");
		System.out.println("2.Biscuts");
		System.out.println("3.toys");
		int op = o.nextInt();
		switch (op) {
		case 1:
			chocolate();
			break;
		case 2:
			biscuts();
			break;
		case 3:
			toys();
			break;

		}

	}

	void second() {
		System.out.println("1.Juice");
		System.out.println("2.Chinese");
		System.out.println("3.Indian");
		int op = o.nextInt();
		switch (op) {
		case 1:
			juice();
			break;
		case 2:
			chinese();
			break;
		case 3:
			indian();
			break;

		}

	}

	void third() {
		System.out.println("1.Men fashions");
		System.out.println("2.Women");
		System.out.println("3.kids world");
		int op = o.nextInt();
		switch (op) {
		case 1:
			men();
			break;
		case 2:
			women();
			break;
		case 3:
			kids();
			break;

		}

	}

	void fourth() {
		System.out.println("1.Gold");
		System.out.println("2.Silver");
		// System.out.println("3.Platinum");
		// System.out.println("4.Diamond");
		int op = o.nextInt();
		switch (op) {
		case 1:
			gold();
			break;
		case 2:
			silver();
			break;
		// case 3: platinum();break;
		// case 4: diamond();break;
		}

	}

	void lift() {
		System.out.println("Select the floor....");
		System.out.println("0-Ground floor-Home appliciens and billing");
		System.out.println("1-Fitst floor-Kids");
		System.out.println("2-Second floor-Food Court");
		System.out.println("3-Third floor-Fashions");
		System.out.println("4-Fourth floor-Jewels");
		int f = o.nextInt();
		switch (f) {
		case 0:
			ground();
			break;
		case 1:
			first();
			break;
		case 2:
			second();
			break;
		case 3:
			third();
			break;
		case 4:
			fourth();
			break;

		}

	}
}

public class Suriya {

	public static void main(String[] args) {

		System.out.println("WELCOME TO LEGEND STORES");
		System.out.println("PLEASE ENTER INTO LIFT");
		Catagory ob = new Catagory();
		ob.lift();

	}

}
