package collecpro;
import java.util.*;
public class removeevennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=10;i<25;i++)
		{
			list.add(i);
		}
		System.out.println(list);
		Iterator i=list.iterator();
		while(i.hasNext())
		{
			if((int) i.next() %2 ==0)
			{
				i.remove();
			}
		}
System.out.println(list);
	}

}
