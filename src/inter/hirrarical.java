package inter;
interface x
{
	void add();
}
interface y extends  x
{
    void sub();
}
interface z extends x
{
	void mul(); 
	}
public class hirrarical implements y,z
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hirrarical h=new hirrarical();

	}
	hirrarical()
	{
		sub();add();
		mul();
	}
	@Override
	public void sub() {
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
		System.out.println("This is mul");
		
	}

}
