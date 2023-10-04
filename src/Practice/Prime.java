package Practice;
import java.util.Scanner;
public class Prime 
{
   
	public static void main(String argv[])
	{   
		Scanner ob =new Scanner(System.in);
		System.out.println("Enter the number...");
	    int n=ob.nextInt();
	    int a=0;
		for(int i=1;i<=n;i++)
		{
			if(n % i ==0)
			{
				a++;
			}
		}
		if(a==2)
		System.out.println("Number is prime");
		else
		System.out.println("Number is composite");	
	}
	
	

}
