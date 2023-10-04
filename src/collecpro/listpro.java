package collecpro;

import java.util.*;

public class listpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ob = new LinkedList<>();
		ob.add(1);
		ob.add(30);
		ob.add(1);
		ob.add(50);
		ob.add(60);
		ob.add(70);
		ob.add(30);
		ob.add(80);
		System.out.println(ob.get(1));
		ArrayList<Object> ob1 = new ArrayList<>();
		ob1.add(5);
		ob1.add(6);
		ob1.add(7);
		ob1.add(3);
		ob1.add(8);
		System.out.println(ob1);
		ob1.add(ob);
		System.out.println(ob1);
		System.out.println(ob1.get(5));

	}

}
