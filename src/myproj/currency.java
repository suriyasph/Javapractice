package myproj;


import java.util.Scanner;

public class currency {
	
	currency() {
		float org=0f;
		int d;
		float sam=0f;
		System.out.println("------------------------------------------------------------");
		System.out.println("");
		System.out.println("please enter the type of currency you are having");
		System.out.println("United States Dollar=>1");
		System.out.println("Euro=>2");
		System.out.println("pound sterling=>3");
		System.out.println("dinar=>4");
		System.out.println("yuan=>5");
		System.out.println("canadian dollar=>6");
		
		Scanner g=new Scanner(System.in);
		d=g.nextInt();
		System.out.println("---------------------------------------------------------");

		System.out.println("please enter the AMOUNT you  want to convert");
		Scanner c= new Scanner(System.in);
		org=c.nextInt();
		System.out.println("");
		switch(d) {
		case 1:
			sam=org*80f;
			System.out.println("your"+org+"dollars is converted to"+sam+"indian rupees");
			break;
		case 2:
			sam=org*75f;
			System.out.println("your"+org+"EUros is converted to"+sam+"indian rupees");
			break;
		case 3:
			sam=org*120f;
			System.out.println("your"+org+"pounds is converted to"+sam+"indian rupees");
			break;
		case 4:
			sam=org/20f;
			System.out.println("your"+org+"dinars is converted to"+sam+"indian rupees");
			break;
		case 5:
			sam=org*60;
			System.out.println("your"+org+"yuans is converted to"+sam+"indian rupees");
			break;
		case 6:
			sam=org*90;
			System.out.println("your"+org+"canadian dollars is converted to"+sam+"indian rupees");
			break;
		default:
			System.out.println("vartaaa mame durr..............");
			break;	
		}
		System.out.println("");
		System.out.println("------------------------------------------------------------");

		float amt;
		System.out.println("please enter your required amount to change");
		System.out.println("please enter the required currency");
		System.out.println("United States Dollar=1");
		System.out.println("Euro=2");
		System.out.println("pound sterling=3");
		System.out.println("dinar=4");
		System.out.println("yuan=5");
		System.out.println("canadian dollar=6");

		Scanner b= new Scanner(System.in);
		int n=b.nextInt();
		switch(n) {
		case 1:
			amt=sam/80f;
			System.out.println("your"+sam+"rupees is converted to"+(amt-(amt*0.1))+"dollars with tax deduction");
			break;
		case 2:
			amt=sam/75f;
			System.out.println("your"+sam+"rupees is converted to"+(amt-(amt*0.1))+"Euros with tax deduction");
			break;
		case 3:
			amt=sam/120f;
			System.out.println("your"+sam+"rupees is converted to"+(amt-(amt*0.1))+"pounds with tax deduction");
			break;
		case 4:
			amt=sam*20f;
			System.out.println("your"+sam+"rupees is converted to"+(amt-(amt*0.1))+"dinars with tax deduction");
			break;
		case 5:
			amt=sam/60;
			System.out.println("your"+sam+"rupees is converted to"+(amt-(amt*0.1))+"yuan with tax deduction");
			break;
		case 6:
			amt=sam/90;
			System.out.println("your"+sam+"rupees is converted to"+(amt-(amt*0.1))+"canadian dollars with tax deduction");
			break;
		default:
			System.out.println("vartaaa mame durr..............");
			break;
		}
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("IF YOU WANT TO CONTINUE, PRESS ok");
		}
	static void intro() {
		System.out.println("		welcome to MAARIYAMMAN INDIAN BANK		");
		System.out.println("");
		System.out.println("Here, your currencies are converted to foreign currencies,\nonly with countries which comes under our bank guidelines");
		System.out.println("TAXES AND CHARGES MAY APPLY");
		System.out.println("");
	}
	public static void main(String[] args) {
		intro();
		String s1="";
		do {
		currency ob= new currency();
		Scanner oh= new Scanner(System.in);
		 s1=oh.next();
		}while(s1.equals("ok"));
	}
}

