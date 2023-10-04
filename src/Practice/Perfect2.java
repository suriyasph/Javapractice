package Practice;

import java.util.Scanner;

public class Perfect2 
{
	public static void main(String args[])
	{   
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the start number...");
		int s=ob.nextInt();
		System.out.println("Enter the end number....");
		int e=ob.nextInt();
		
	
		for(int i=s;i<=e;i++)
		{
			int sum=0;
			int c=i/2; 
		for(int j=1;j<=c;j++)
		{
		  if(i%j ==0)
			sum+=j;
		}
		if(sum == i)
			System.out.println(i);
	
		}
	}
}
