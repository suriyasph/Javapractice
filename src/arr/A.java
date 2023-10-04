package arr;
import java.util.*;
public class A {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the array size..");
		int size=s.nextInt();
		long a[]=new long[size];
		for(int i=0;i<a.length;i++)
		{          
			System.out.println("Enter the "+i+" value");
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("The "+i+" value.."+a[i]);
			
		}
		System.out.println();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println("The "+i+" value.."+a[i]);
			
		}
      

	}
	
}
