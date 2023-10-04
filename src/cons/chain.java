package cons;

public class chain 
{
	chain()
	{   
		this(2,4);
		System.out.println("I am Non parametric constructor");
	}
	chain(int a ,int b)
	{   
		this(5,7,5);
		System.out.println(a+b);
	}
	chain(int a,int b,int c)
	{
		System.out.println(a+b+c);
		System.out.println("This is chain constructor");
	}
	void display()
	{
		System.out.println("Thank you");
	}
	
	
      public static void main(String a[])
      {
    	  chain c=new chain();     
    	  c.display();
      }
}
