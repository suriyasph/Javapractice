package arr;
import java.util.*;

public class count 
{   
	void fun()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		int p=0,n=0,z=0;
		int []a=new int[size];
		for (int i=0;i<a.length;i++)
		{
		  System.out.println("Enter the "+ (i)+" value");
		  a[i]=s.nextInt();
		}
		for (int i=0;i<a.length;i++)
		{
		  if(a[i]>0)
			  p++;   
		  else if(a[i]<0)
			  n++;
		  else
			  z++;
 
		}
		System.out.println("The positive number count is "+p);
		System.out.println("The negative number count is "+n);
		System.out.println("The zeros count is "+z);



	}
	count()
	{
		fun();
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
        count ob=new count();
        
	}

}
