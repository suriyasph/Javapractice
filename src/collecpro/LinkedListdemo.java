package collecpro;
import java.util.*;
public class LinkedListdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>  list=new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(50);
		list.add(6);
		list.add(7);
		System.out.println(list.peek());
		System.out.println(list);
	/*	Iterator i= list.iterator();	
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
        System.out.println("---------------------------------");
        ListIterator li= list.listIterator(list.size());
        while(li.hasPrevious())
        {
        	System.out.println(li.previous());
        }
        System.out.println("---------------------------------");

        for(Integer f:list)
        {
        	System.out.println(f);
        }
        System.out.println("---------------------------------");

        for(int j=0;j<list.size();j++)
        {
        	System.out.println(list.get(j));
        }
	*/

	}

}
