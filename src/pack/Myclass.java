package pack;
import java.util.Scanner;
class Pattern
{
	void p1(int n)
	{
		 for (int i=1;i<=n;i++)
	        {
	            for(int j=1;j<=n;j++)
	            {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
		 System.out.println();
	}
	void p2(int n)
	{
		 for (int i=1;i<=n;i++)
	        {
	            for(int j=1;j<=i;j++)
	            {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
		 System. out.println();
	}
	void p3(int n)
	{
		 for (int i=1;i<=n;i++)
	        {
	            for(int j=i;j<=n;j++)
	            {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
		 System.out.println();
	}
	void p4(int n)
	{
		 for (int i=1;i<=n;i++)
	        {
	            for(int j=1;j<=n;j++)
	            {   
	            	if(i>j)
	                System.out.print(" ");
	                else
	            	System.out.print("*");
	                
	            }
	            System.out.println();
	        }
		 System.out.println();
	}
	void p5(int n)
	{
		 for (int i=1;i<=n;i++)
	        {
	            for(int j=1;j<=n;j++)
	            {   
	            	if(n-i>=j)
	                System.out.print(" ");
	                else
	            	System.out.print("*");
	                
	            }
	            System.out.println();
	        }
		 System.out.println();
	}
	void p6(int n)
	{
		 for (int i=1;i<=n;i++)
	        {
	            for(int j=1;j<=n;j++)
	            {   
	            	if(n-i>=j)
	                System.out.print(" ");
	                else
	            	System.out.print("* ");
	                
	            }
	            System.out.println();
	        }
		 System.out.println();
	}
	void p7(int n)
	{
		 for (int i=1;i<=n;i++)
	        {
	            for(int j=1;j<=n;j++)
	            {   
	            	if(i>j)
	                System.out.print(" ");
	                else
	            	System.out.print("* ");
	                
	            }
	            System.out.println();
	        }
		 System.out.println();
	}
	void p11(int n)
	{
		 for (int i=1;i<2*n;i++)
	        {
	            for(int j=1;j<=n;j++)
	            {   
	            	if(i>j)
	                System.out.print(" ");
	                else
	            	System.out.print("*");
	                
	            }
	            System.out.println();
	        }
		 System.out.println();
	}
}

public class Myclass 
{
    public static void main(String args[]) 
    {  
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the number.....");
        int n=ob.nextInt();
        Pattern p=new Pattern();
    //   p.p1(n);
       // p.p2(n);
    //   p.p3(n);
       // p.p4(n);
     //   p.p5(n);
        p.p6(n);
        p.p7(n);  
     //   p.p11(n);
       
     
    }
}