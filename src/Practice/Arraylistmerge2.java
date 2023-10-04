package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

class First {
	String name;
	int id;
	int salary;
	String designation;
	ArrayList<First> empobj;

	First(ArrayList<First> emobj) {
		this.empobj = emobj;
	}

	public First(String name, int id, int salary, String designation) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.designation = designation;
	}

	public void list() {
		empobj.add(new First("Suriya", 1, 28000, "Junior Engineer"));
		empobj.add(new First("Vikram", 2, 32000, "Senior  Enginner"));
		empobj.add(new First("Saran", 3, 32000, "Senior  Engineer"));
		empobj.add(new First("Rakesh", 4, 28000, "Junior  Engineer"));
		empobj.add(new First("Thiagu", 5, 28000, "Junior  Engineer"));
		empobj.add(new First("Sunil", 6, 16000, "Gradute Trainee"));
		empobj.add(new First("Vignesh", 7, 35000, "Team leader"));
		empobj.add(new First("Udhaya", 8, 17000, " Engineer Trainee"));
		empobj.add(new First("Monaj", 9, 17000, " Engineer Trainee"));
		empobj.add(new First("Bharath", 10, 40000, "Assintant Manager"));
		empobj.add(new First("Sukumar", 11, 55000, "Manager"));
		empobj.add(new First("Nagaraj", 12, 17000, " Engineer Trainee"));
		empobj.add(new First("Bala", 13, 17000, " Engineer Trainee"));
		empobj.add(new First("Gokul", 14, 15000, " Graduate Trainee"));
		empobj.add(new First("Suresh", 15, 15000, "Graduate Trainee"));
		empobj.add(new First("Prakash", 16, 16000, "Gradute Trainee"));

		for (First i : empobj)
			System.out.println(i.id + " " + i.name + " " + i.salary + " " + i.designation);
	}
}

class First1 {
	int id;
	String department;
	String division;
	ArrayList<First1> empobj2;

	First1(ArrayList<First1> emobj2) {
		this.empobj2 = emobj2;
	}

	public First1(int id, String department, String division) {
		this.id = id;
		this.department = department;
		this.division = division;
	}

	public void list() {
		empobj2.add(new First1(1, "Qulity Assurance", "LapGDC"));
		empobj2.add(new First1(2, "Qulity Assurance", "LaPTW"));
		empobj2.add(new First1(3, "Production", "LapGDC"));
		empobj2.add(new First1(4, "Production", "LapTW"));
		empobj2.add(new First1(5, "Qulity Control", "LapTW"));
		empobj2.add(new First1(6, "Qulity Control", "LapGDC"));
		empobj2.add(new First1(7, "Qulity Assurance", "LapGDC"));
		empobj2.add(new First1(8, "Qulity Assurance", "LapGDC"));
		empobj2.add(new First1(9, "Qulity Assurance", "LapTW"));
		empobj2.add(new First1(10, "Production", "LapTW"));
		empobj2.add(new First1(11, "Qulity Assurance", "LapGDC"));
		empobj2.add(new First1(12, "Production", "LapGDC"));
		empobj2.add(new First1(13, "Quality Control", "LapTW"));
		empobj2.add(new First1(14, "Production", "LapGdc"));
		empobj2.add(new First1(15, "Production", "LapTW"));
		empobj2.add(new First1(16, "Production", "LapTW"));
		for (First1 i : empobj2)
			System.out.println(i.id + " " + i.department + " " + i.division);
	}
}

public class Arraylistmerge2 {
	String name;
	int id;
	int salary;
	String designation;
	String department;
	String division;

	public String toString() {
		return name + " " + salary + " " + designation + " " + department + " " + division;
	}

	public Arraylistmerge2(String name, int salary, String designation, String department, String division) {
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.department = department;
		this.division = division;
	}
	/*
	 * void addlist(BiFunction< ArrayList<First>,ArrayList<First1>,HashMap<Integer
	 * ,Arraylistmerge2>> fun,BiPredicate<ArrayList<First>,ArrayList<First1>> bipre)
	 * {ArrayList<First> empopj; ArrayList<First1> empobj2; HashMap<Integer,
	 * Arraylistmerge2> hmap;
	 * 
	 * 
	 * for(First i:empopj) { for(First1 j:empobj2) { if(bipre.test(i, j))) {
	 * 
	 * } }
	 * 
	 * }
	 * 
	 * }
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ArrayList<First> empobj=new ArrayList<>();
	    ArrayList<First1> empobj2=new ArrayList<>();
	    new First(empobj).list();;
	    new First1(empobj2).list();;
        System.out.println();

		HashMap<Integer ,Arraylistmerge2> hmap = new HashMap<Integer, Arraylistmerge2>();
		for(First i:empobj)
		{
			for(First1 j:empobj2)
			{

				hmap.put(i.id,new Arraylistmerge2(i.name,i.salary,i.designation,j.department,j.division));
			}

		}
		for(Map.Entry<Integer, Arraylistmerge2> i:hmap.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue().name);
		}
	
		/*
		 * addlist((empobj,empobj1)->hmap.put(i.id,new
		 * Arraylistmerge2(i.name,i.salary,i.designation,j.department,j.division));
		 * (empobj,empobj1)->{ return i.id==j.id}));
		 * 
		 * 
		 */
	}
}
