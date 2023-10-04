package pack;

import java.util.Scanner;

public class Tsk1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter  number");
        int a=sc.nextInt();
        System.out.println("FD");
        for(int i=1;i<=a;i++) {
        	System.out.println(i);
        }
        System.out.println("RD");
        for(int j=a;j>=1;j--) {
        	System.out.println(j);
        }
	}

}
