package Practice;
import java.util.*;

public class factpractice {
	static int factorial(int fact)
	{
	    if(fact==0)
	       return 1;
	    else
	       return fact *factorial(fact-1);

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		 System.out.println("");
		    int n=scan.nextInt();
		    factorial(n);
		    System.out.println(n);

	}

}
