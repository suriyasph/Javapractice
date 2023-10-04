package pattrern;

import java.util.Scanner;

public class Rightangletri 
{
	 
		public static void main(String argv[])
		{
			Scanner s= new Scanner(System.in);
			System.out.print("Enter the n value...");
			int n= s.nextInt();
			char num='A';
			for(int row=1;row<=n;row++)
			{	
				for (int col=1;col<=row;col++)
				{
					System.out.print(num++);
					
				}
				System.out.println();
			}
		}

}
