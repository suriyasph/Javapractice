package pattrern;
import java.util.*;
public class CacheManager
{    
	void pattern1( int n)
	{
		for(int i=1;i<=n;i++)
		{
			 for(int j=1;j<=n;j++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		}
	}
	void pattern2( int n)
	{
		for(int i=1;i<=n;i++)
		{
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		}
	}
	void pattern3( int n)
	{
		for(int i=1;i<=n;i++)
		{
			 for(int j=i;j<=n;j++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		}
	}
	
	
	

	public static void main(String[] args)
	{   
		Scanner s= new Scanner(System.in);
        System.out.println("Enter the value of n....");
        int n =s.nextInt();
        CacheManager o= new CacheManager();
        
        o.pattern3(n);
	}

}

