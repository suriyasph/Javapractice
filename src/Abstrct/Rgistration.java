 package Abstrct;
import java.util.*;
abstract class Form
{
  abstract void name();
  abstract void mobile();
  abstract void email();
  abstract void address();
}
class Usersignup extends Form
{   Scanner s=new Scanner(System.in);
    String n,em,ad;
    long m;
	void name()
	{
		System.out.println("Enter the name..");
		n=s.nextLine();
	    
	}
	void mobile()
	{
		 System.out.println("Enter the mobile number..");
	     m=s.nextLong();
	     int c=0;
	     long t=m;
	     while(t>0)
	     {
	    	 t=t/10;
	    	 c++;
	     }
	     if(c==10) 
	     {}
	     else
	     {   
	    	 System.out.println("Enter correctly");
	    	 mobile();
	     }
	     
	} 
	void email()
	{
		System.out.println("Enter the email address..");
	    em=s.next();

	}
	void address()
	{
		System.out.println("Enter the address..");
		ad=s.next();
	}
	void display()
	{
		System.out.println(n);
		System.out.println(m);
		System.out.println(em);
		System.out.println(ad);

	}
}
class Userlogin extends Usersignup
{    
	long mn;
	void mobile()
	{
		 System.out.println("Enter the mobile number..");
	     mn=s.nextLong();
	     int c=0;
	     long t=mn;
	     while(t>0)
	     {
	    	 t=t/10;
	    	 c++;
	     }
	     if(c==10) 
	     {}
	     else
	     {   
	    	 System.out.println("Enter correctly");
	    	 mobile();
	     }
	     
	} 
}

public class Rgistration extends Userlogin
{

	public static void main(String[] args)
	{
     Usersignup r=new Usersignup();
     Userlogin o =new Userlogin();
     r.name();
     r.mobile();
     r.email();
     r.address();
   //  r.display();
     o.mobile();
     if(o.mn ==r.m)
     {
    	 System.out.println("Login sucessfull");
     }
     else 
     {
    	 System.out.println("Login Unsecessful");
     }
 	}

}
