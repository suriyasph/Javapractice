package collecpro;
import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ob=new ArrayList<>();
		for(int i=1;i<=10;i++)
		{
			ob.add(i);
		}
		ob.set(5, 86);
		System.out.println(ob);
		System.out.println("Get method "+ob.get(5));
		for(Integer a:ob)
		{
			System.out.println(a);
		}
		System.out.println("------------------------------");
		for(int i=0;i<ob.size();i++)
		{
			System.out.println(ob.get(i));
		}
		System.out.println("------------------------------");

		Iterator it=ob.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
