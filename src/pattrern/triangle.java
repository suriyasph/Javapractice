package pattrern;
import java.util.*;

public class triangle 
{    
 public static void main(String[] argv) 
 {
     Scanner s =new Scanner(System.in);
     System.out.println("enter the value..");
    int  n=s.nextInt();
     int i;
     int j;
     
     for( i=1;i<=n;i++)
     {   
    	for(j=1;j<=n-i;j++) 
    	      {  
    		 System.out.print(" ");
    		 }
    	for(j=1;j<=i;j++)
    	 {
    		 System.out.print("* ");
    	}
    	System.out.println();
     }
}      
}