package collecpro;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

class comp implements Comparator<comparator> {
	public int compare(comparator ob1, comparator ob2) {
		if (ob1.id < ob2.id)
			return -1;

		else if (ob1.id > ob2.id)
			return 1;
		else
			return 0;
	}

}

class comp1 implements Comparator<comparator> {
	public int compare(comparator ob1, comparator ob2) {
		if (ob1.salary < ob2.salary)
			return -1;
		else if (ob1.salary > ob2.salary)
			return 1;
		else
			return 0;
	}

}

class comp2 implements Comparator<comparator> {
	public int compare(comparator ob1, comparator ob2) {
		int a = ob1.empname.compareToIgnoreCase(ob2.empname);
		return a;
	}

}

class comp3 implements Comparator<comparator> {
	public int compare(comparator ob1, comparator ob2) {
		if (ob1.empname.length() < ob2.empname.length())
			return -1;

		else if (ob1.empname.length() > ob2.empname.length())
			return 1;
		else
			return 0;
	}

}

public class comparator {
	String empname;
	int id;
	int salary;

	public comparator(String empname, int id, int salary) {
		this.empname = empname;
		this.id = id;
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<comparator> obj = new ArrayList<>();
		obj.add(new comparator("suriya", 21012419, 20000));
		obj.add(new comparator("prakash", 21012482, 21000));
		obj.add(new comparator("thiyagu", 21011567, 19000));
		obj.add(new comparator("sunil", 21014588, 25000));
		obj.add(new comparator("suresh", 21011922, 23000));
		obj.add(new comparator("nagaraj", 21013548, 28000));
		for (comparator c : obj) {
			System.out.println(c.empname + " " + c.id + " " + c.salary);
		}
		System.out.println("-----------------------------------------------------");
		comp cob = new comp();
		comp1 cob1 = new comp1();
		comp2 cob2 = new comp2();
		comp3 cob3 = new comp3();

		Collections.sort(obj, cob);
		for (comparator c : obj) {
			System.out.println(c.id + " " + c.empname + " " + c.salary);
		}
		System.out.println("-----------------------------------------------------");

		Collections.sort(obj, cob1);
		for (comparator c : obj) {
			System.out.println(c.id + " " + c.empname + " " + c.salary);
		}
		System.out.println("-----------------------------------------------------");

		Collections.sort(obj, cob2);
		for (comparator c : obj) {
			System.out.println(c.id + " " + c.empname + " " + c.salary);
		}
		System.out.println("-----------------------------------------------------");

		Collections.sort(obj, cob3);
		for (comparator c : obj) {
			System.out.println(c.id + " " + c.empname + " " + c.salary);
		}

	}

}
