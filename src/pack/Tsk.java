package pack;

import java.util.Scanner;

public class Tsk {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter Epx");
        int e=sc.nextInt();
        System.out.println("Enter Gen");
        String g=sc.next();
        System.out.println("Enter Salary");
        int s=sc.nextInt();
        if(e>=2) {
        	System.out.println("Increment");
        	
        	s=s+1000;
        	if(g.equals("female")) {
        		s=s+5000;
        		System.out.println(s);
        	}
        	else {
        		s=s+3000;
        		System.out.println(s);
        	}
        }
        else {
        	System.out.println("No Increment");
        	System.out.println(s);
        }
        

	}

}
