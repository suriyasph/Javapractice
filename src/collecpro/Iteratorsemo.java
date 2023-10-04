package collecpro;
import java.util.*;

public class Iteratorsemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ob=new ArrayList<>();
		ob.add(10);
		ob.add(1);
		ob.add(14);
		ob.add(15);
		ob.add(17);
		System.out.println(ob);
		Iterator a=ob.iterator();
		while(a.hasNext())
			System.out.println(a.next());
		System.out.println(ob.toString());


	}

}
