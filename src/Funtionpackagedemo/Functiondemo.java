package Funtionpackagedemo;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Scanner;

public class Functiondemo {
	String name;
	int salary;
	String designation;

	public Functiondemo(String name, int salary, String designation) {
		this.name = name;
		this.salary = salary;
		this.designation = designation; 
	}

	static void viewdata(ArrayList<Functiondemo> empobj) {
		for (Functiondemo ob : empobj)
			System.out.println("Name:" + ob.name + "\nDesignation: " + ob.designation + "\nSalary:" + ob.salary + "\n");

	}

	static void filter(ArrayList<Functiondemo> empobj, Predicate<Functiondemo> pre) {
		for (Functiondemo ob : empobj) {
			if (pre.test(ob))
				System.out.println(ob.name);
		}

	}

	static void filter1(ArrayList<Functiondemo> empobj, Predicate<Functiondemo> pre,
			Function<Functiondemo, Object> fun) {
		for (Functiondemo ob : empobj) {
			if (pre.test(ob))
				System.out.println(fun.apply(ob));
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Functiondemo> empobj = new ArrayList<>();
		empobj.add(new Functiondemo("Suriya", 28000, "Junior Qulity Engineer"));
		empobj.add(new Functiondemo("Vikram", 32000, "Senior Production Enginner"));
		empobj.add(new Functiondemo("Saran", 32000, "Senior Quality Engineer"));
		empobj.add(new Functiondemo("Rakesh", 28000, "Junior Qulity Engineer"));
		empobj.add(new Functiondemo("Thiagu", 28000, "Junior Production Engineer"));
		empobj.add(new Functiondemo("Sunil", 16000, "Qulity Trainee"));
		empobj.add(new Functiondemo("Vignesh", 35000, "Production Team leader"));
		empobj.add(new Functiondemo("Udhaya", 17000, "Qulity Engineer Trainee"));
		empobj.add(new Functiondemo("Monaj", 17000, "Qulity Engineer Trainee"));
		empobj.add(new Functiondemo("Bharath", 40000, "Assintant Manager"));
		empobj.add(new Functiondemo("Sukumar", 55000, "Manager"));
		empobj.add(new Functiondemo("Nagaraj", 17000, "Qulity Engineer Trainee"));
		empobj.add(new Functiondemo("Bala", 17000, "Qulity Engineer Trainee"));
		empobj.add(new Functiondemo("Gokul", 15000, "Qulity Trainee"));
		empobj.add(new Functiondemo("Suresh", 15000, "Production Trainee"));
		empobj.add(new Functiondemo("Prakash", 16000, "Production Trainee"));
		// viewdata(empobj);
		System.out.println("Salary filter Algorithm");
		filter(empobj, ob -> ob.salary > 20000);// Salary Algorithm
		System.out.println("Designation filter Algorithm");
		filter(empobj, ob -> ob.designation.contains("Junior Qulity Engineer"));// Designatiom Algorithm
		System.out.println("Enter the Employee name to find his salary ...");
		String searchname = scanner.next();
		filter1(empobj, pre -> pre.name.equalsIgnoreCase(searchname), fun -> fun.salary);// Salary Algorithm
		System.out.println("Enter the Employee name to find his desgination ...");
	    String secondsearchname = scanner.next();
		filter1(empobj, pre -> pre.name.equalsIgnoreCase(secondsearchname), fun -> fun.designation);// Designatiom Algorithm
		


	}

}
