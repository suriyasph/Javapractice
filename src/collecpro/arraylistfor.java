package collecpro;

import java.util.ArrayList;

public class arraylistfor {
	String Employee;
	int id;
	int salary;

	arraylistfor(String Employee, int id, int salary) {
		this.Employee = Employee;
		this.id = id;
		this.salary = salary;
	}

	public static void main(String[] args) {
// TODO Auto-generated method stub
		ArrayList<arraylistfor> ob = new ArrayList<>();
		ob.add(new arraylistfor("suriya", 15, 15000));
		ob.add(new arraylistfor("nandha", 16, 18000));
		ob.add(new arraylistfor("thiyagu", 17, 20000));
		for (arraylistfor a : ob) {
			System.out.println(a.Employee+" "+a.id+" "+a.salary);

		}
	}
}