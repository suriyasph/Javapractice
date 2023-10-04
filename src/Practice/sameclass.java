package Practice;

public class sameclass
{
	sameclass()
	{
		add();
		sub();
		mul();
		div();
	}
   void add()
   {  
	   System.out.println("This is add");
   }
   void sub()
   {   
	   System.out.println("This is sub");
   }
   void mul()
   {   
	   System.out.println("This is mul");
   }
   void div()
   {
	   System.out.println("This is div");
   }
	public static void main(String[] args) 
	{
		sameclass s=new sameclass();

	}

}
