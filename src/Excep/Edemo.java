package Excep;

public class Edemo extends Exception
{
	Edemo(String s)
	{
		super(s);
	}
	void div(int a, int b) throws Edemo
	{
	if(b==0)
	{
	throw new Edemo("Please give number greater than zero");
	}
	else{
	System.out.println(a/b);
	}
	}
public static void main(String []argv) 
{
	Edemo n=new Edemo("s");
	
	try {
		n.div(10,0);
	} catch (Exception e) {
		System.out.println(e);
	}
	
	
}	
}
