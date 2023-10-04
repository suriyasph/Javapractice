package inter;
interface a
{
	void add();
	void mul();
}
interface b 
{ void sub();
  void div();
	
	}

public class multi implements b,a
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        multi m=new multi();
	}
	multi()
	{
		add();
		sub();
		mul();
		div();
	}

	@Override
	public void sub() 
	{
		// TODO Auto-generated method stub
		System.out.println("This is sub");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("This is add");
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("This  is mul");
	}
	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("This is div");
	}

}
