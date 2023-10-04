package cons;

public class pattern 
{
       pattern()
       {
    	   for (int i=1;i<=5;i++)
    	   {
    		   for(int j=1;j<=5;j++)
    		   {   
    			   if(i<=j)
    			   System.out.print("* ");
    			   else
    				 System.out.print(" ");
    			
    		   }
    		   System.out.println();
    		   
    	   }

    	   for (int i=2;i<=5;i++)
    	   {
    		   for(int j=1;j<=5;j++)
    		   {   
    			   if(i<5-j+1)
    			   System.out.print(" ");
    			   else
    				 System.out.print("* ");
    			
    		   }
    		   System.out.println();
    	   }
       }
   pattern(int n)
   {		 
	   for(int i=0;i<n;i++)
	   {  
		   for(int j=0;j<n;j++)
		   {    if(j==(n-i))
			   System.out.print("*");
		   else
			   System.out.print(" ");
		   }System.out.println();
	   }
   
   }
   
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		pattern p=new pattern(5);

	}

}
