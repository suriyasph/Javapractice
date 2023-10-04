package Practice;

public class sp 
{
   void pattern(int n)
   {
	   for(int i=1;i<=n;i++)
	   {   for (int j=1;j<=n;j++)
		   {   if(i<=j)
			   System.out.print(8+" " );
		       else 
		    	   System.out.print(" ");
           }
		   System.out.println(); 
	   }
	
   }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
            sp s=new sp();
            s.pattern(5);
	}

}
 