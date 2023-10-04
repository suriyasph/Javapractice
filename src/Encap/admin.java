package Encap;
import java.util.*;
class login
{
	private long number;
	private String password;
	void set_number(long a)
	{
		number=a;
	}

	void set_pass(String b)
	{
		password=b;
	}
	long getnumber()
	{
             return number;
    }
	String getpass()
	{
		return password;
	}
}
public class admin extends login
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number..");
		long n=s.nextLong();
		System.out.println("Enter the pssword..");
		String s1=s.next();
		admin r=new admin();
		r.set_number(n);
		r.set_pass(s1);
		System.out.println(r.getnumber());
		System.out.println(r.getpass());
		
		

	}

}
