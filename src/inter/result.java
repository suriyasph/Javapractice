package inter;
interface vehicle
{void run();

}
class car implements vehicle
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is car");
}
	}
class bike implements vehicle
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is bike");
		
	}
	
	}
class mechanic
{ void check(vehicle r)
	{
	  r.run();
	}
	}
public class result
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mechanic n=new mechanic();
		bike n1 =new bike();
		n.check(n1);
		car n2=new car();
		n.check(n2);

	}

}
