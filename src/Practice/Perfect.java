package Practice;
import java.util.*;
public class Perfect
{ 
	public static void main(String args[])
	{   
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
		  if(n%i==0)
			sum+=i;
		}
		if(sum==n)
			System.out.println("Perfect number");
		else
			System.out.println("Not a perfect number");
	}

}
