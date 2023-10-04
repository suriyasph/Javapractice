package Practice;
import java.util.*;
public class Fibonaci {

	public static void main(String[] args) 
	{
      Scanner ob=new Scanner(System.in);
      int e=ob.nextInt();
      int n1=0,n2=1,n3=0;
      System.out.println(n1);
      System.out.println(n2);
      while(n3<e)
      {
    	  n3=n1+n2;
    	  System.out.println(n3);
    	  n1=n2;
    	  n2=n3;
    	  if(n3<e)
    		  break;	  
    	  
      }
	}

}
 