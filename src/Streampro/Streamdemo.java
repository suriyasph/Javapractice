package Streampro;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Streamdemo {
	String name;
	int salary;
	String designation;

	@Override
	public String toString() {
		return "name=" + name + ", salary=" + salary + ", designation=" + designation ;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public String getDesignation() {
		return designation;
	}

	public Streamdemo(String name, int salary, String designation) {
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	public static void main(String[] argv) {
		ArrayList<Streamdemo> empobj = new ArrayList<>();
		empobj.add(new Streamdemo("Suriya", 28000, "Junior Quality Engineer"));
		empobj.add(new Streamdemo("Vikram", 32000, "Senior Production Enginner"));
		empobj.add(new Streamdemo("Saran", 32000, "Senior Quality Engineer"));
		empobj.add(new Streamdemo("Rakesh", 28000, "Junior Quality Engineer"));
		empobj.add(new Streamdemo("Thiagu", 28000, "Junior Production Engineer"));
		empobj.add(new Streamdemo("Sunil", 16000, "Qulity Trainee"));
		empobj.add(new Streamdemo("Vignesh", 35000, "Production Team leader"));
		empobj.add(new Streamdemo("Udhaya", 17000, "Qulity Engineer Trainee"));
		empobj.add(new Streamdemo("Monaj", 17000, "Qulity Engineer Trainee"));
		empobj.add(new Streamdemo("Bharath", 40000, "Assintant Manager"));
		empobj.add(new Streamdemo("Sukumar", 55000, "Manager"));
		empobj.add(new Streamdemo("Nagaraj", 17000, "Qulity Engineer Trainee"));
		empobj.add(new Streamdemo("Bala", 17000, "Qulity Engineer Trainee"));
		empobj.add(new Streamdemo("Gokul", 15000, "Qulity Trainee"));
		empobj.add(new Streamdemo("Suresh", 15000, "Production Trainee"));
		empobj.add(new Streamdemo("Prakash", 16000, "Production Trainee"));
		/*
		 * Stream<Streamdemo> obj = empobj.stream().filter(x -> x.salary > 20000);
		 * obj.forEach(x -> System.out.println(x.name));
		 * System.out.println("----------------------------------");
		 * empobj.stream().filter(x -> x.salary > 20000).forEach(x ->
		 * System.out.println(x.name));
		 * System.out.println("----------------------------------");
		 * empobj.stream().filter(x -> x.salary > 25000).forEach(System.out::println);
		 * System.out.println("----------------------------------");
		 * empobj.stream().filter(x -> x.getName().equalsIgnoreCase("suriya"))
		 * .forEach(x -> System.out.println(x.designation));
		 * System.out.println("-----------------------------------------");
		 * empobj.stream().filter(x ->
		 * x.designation.equalsIgnoreCase("Junior qulity engineer")).map(x -> x.name)
		 * .forEach(a -> System.out.println(a));
		 * System.out.println("-------------------------	"); empobj.stream().filter(x
		 * -> x.getSalary() == 28000).map(x -> x.name).forEach(System.out::println);
		 * System.out.println("-------------------------	"); empobj.stream().filter(x
		 * -> x.getSalary() ==
		 * 28000).map(Streamdemo::getName).forEach(System.out::println);
		 * System.out.println("-------------------------	"); Stream<Streamdemo> obj2
		 * = empobj.stream(); Stream<Streamdemo> op = obj2.filter(x -> x.salary > 20000)
		 * .filter(x -> x.designation.equalsIgnoreCase("Junior Qulaity Engineer"));
		 * Stream<String> op1 = op.map(x -> x.name); op1.forEach(System.out::println);
		 * System.out.println(
		 * "-------------------------------------------------------------");
		 * empobj.stream().map(x -> x.name).sorted().forEach(x ->
		 * System.out.println(x)); System.out.println(
		 * "-------------------------------------------------------------");
		 * empobj.stream().map(x -> x.name).sorted((a, b) -> a.compareTo(b)).forEach(x
		 * -> System.out.println(x));
		 * System.out.println("-----------------------------------------------------");*/
		  empobj.stream().sorted((a, b) -> { if (a.salary > b.salary)
			  return 1; 
		  else if(a.salary < b.salary)
			  return -1;
		  else
		        return 0; }).forEach(System.out::println);
		 
		empobj.stream().filter(x->x.designation.equals("Junior Quality Engineer")).map(x->x.salary).distinct().forEach(System.out::println);

	}

}
