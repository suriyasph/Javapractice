package Practice;
import java.util.Scanner;
public class Prime2
{
	 
		public static void main(String argv[])
		{   
			Scanner ob =new Scanner(System.in);
			System.out.println("Enter the start number...");
		    int f=ob.nextInt();
		    System.out.println("Enter the last  number...");
		    int e=ob.nextInt();
		    int a=0;
		    for(int i=f;i<=e;i++)
		    {
			  for(int j=1;j<=i;j++)
			{
				if(i % j == 0)
				{
					a++;
				}
				
			}
			  // System.out.println(a);
			  if(a==2)
			  System.out.println(i);
			  a=0;
		   }
	}
	
}
