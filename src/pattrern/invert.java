package pattrern;

import java.util.Scanner;

public class invert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{	
			for (int j=1;j<=n;j++)
			{ 
			   if(j>=i)
				 System.out.print(n-i+1);
			   else
			   System.out.print(" ");
			}
			
			System.out.println();
		}}}
