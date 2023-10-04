package pattrern;
import java.util.*;

public class Diamond
{  
	 
		public static void main(String argv[])
		{
			Scanner s= new Scanner(System.in);
			System.out.print("Enter the n value...");
			int n= s.nextInt();
			int r=2*n;
			for(int row=1;row<=r;row++)
			{
				int c= row>n?r+1:r;
				for (int col=1;col<=c;col++)
				{
					System.out.print(" ");
				}
				
				System.out.println();
			}
		}

}
