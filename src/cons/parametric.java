package cons;
public class parametric 
{ 
	parametric(int a)
	{   this (4,5);
		System.out.println("I am constructor");
		System.out.println(a);
	}
	parametric(int a, int b)
	{
		System.out.println(a+b);
	}
	void dispaly()
	{
		System.out.println("Thank you");
	}
	public static void main(String argv[])
	{
		parametric p=new parametric(2);
		p.dispaly();
	}

}
