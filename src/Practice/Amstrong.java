package Practice;
import java.util.*;
class Funtion
{
  int po(int r, int c)
  {   int sum=1;
	  for (int i=1;i<=c;i++)
	  {
		  sum=sum*r;
	  }
	  return sum;
  }
  int am( int n ,int c)
  {   int sum=0;
	  while(n>0)
	  {
	    int r=n%10;
	    sum+=po(r,c);
	    n=n/10;		  	  
	  }
	  
	  return sum;
  }
}
public class Amstrong 
{
	public static void main(String[] args)
	{
		Scanner ob =new Scanner(System.in);
		System.out.println("Enter the number...");
		int n=ob.nextInt();
		int sum=0,c=0,t=n;
		while(t>0)
		{
			t=t/10;
			c++;
		}
    Funtion f=new Funtion();
    sum=f.am(n,c);
    System.out.println(sum);
    if(sum==n)
     System.out.println("Number is amstrong");
    else
    System.out.println("Number is not amstrong");
    
    		
	}

}
