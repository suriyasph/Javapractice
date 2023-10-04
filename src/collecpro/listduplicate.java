package collecpro;
import java.util.*;

public class listduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ob=new LinkedList<>();
		LinkedHashSet<Integer> ob2=new LinkedHashSet<>();
		for(int i=1;i<=10;i++)
			ob.add(i);
		for(int i=1;i<=10;i+=2)
			ob.add(i);
			System.out.println(ob);
		for(int i=0;i<ob.size();i++)
		{
			ob2.add(ob.get(i));
		}
		System.out.println(ob2);

	}

}
