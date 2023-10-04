package Practice;
import java.util.*;

public class Repeat
{
	public static void main(String[] a)
	{   Scanner ob=new Scanner(System.in);
       	Repeat o=new Repeat();
		String option;
	  do
		{
			o.fun();
			System.out.println("Do you wnt to contine");
			option=ob.next();
		}	while(option.equals("yes"));
	   System.out.println("Thank you");

 	 
	}
	void fun()
	{
	   Scanner ob=new Scanner(System.in);

	  System.out.println("Enter number of values to enter..");
      int n=ob.nextInt();
      for(int i=1;i<=n;i++)
     {   
   	 System.out.println("Enter the "+i+" number");
   	  int a1=ob.nextInt();
     }


}
}