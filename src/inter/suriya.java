package inter;
interface able
{
	void add();
	void sub();
}
public class suriya implements able
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		suriya s=new suriya();

	}
	suriya()
	{
		add();
		sub();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("This is add");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("this is sub");
		
	}

}
