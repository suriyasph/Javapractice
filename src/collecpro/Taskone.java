package collecpro;

import java.util.*;

public class Taskone {
	private String name;
	private int age;
	private String course;
	ArrayList<Taskone> oblist = new ArrayList<>();

	Taskone() {
		oblist.add(new Taskone("Suriya", 23, "B.E"));
		oblist.add(new Taskone("Vikram", 23, "B.E"));

		details();
	}

	private Taskone(String name, int age, String course) {
		this.name = name;
		this.age = age;
		this.course = course;
	}

	public String toString() {
		return name + " " + age + " " + course;
	}

	void details() {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the option..");
		System.out.println("add");
		System.out.println("view");
		System.out.println("search");
		System.out.println("delete");
		char d = ob.next().charAt(0);
		switch (d) {
		case 'a':
			add();
			break;
		case 'v':
			view();
			break;
		case 's':
			search();
			break;
		case 'd':
			delete();
			break;

		}

	}

	void add() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name...");
		String name = scanner.nextLine();
		System.out.println("Enter the age...");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the course...");
		String course = scanner.nextLine();
		oblist.add(new Taskone(name, age, course));
		view();
	}

	void view() {
		Iterator<Taskone> i = oblist.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}

	void search() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name to search");
		String searchname = scanner.nextLine();
		Iterator<Taskone> i = oblist.iterator();
		while (i.hasNext()) {
			Taskone ob = i.next();
			if (ob.name.equals(searchname)) {
				System.out.println("Details found");
				System.out.println(ob);
			}

		}
	}

	void delete() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name to delete");
		String searchname = scanner.nextLine();
		Iterator<Taskone> i = oblist.iterator();
		while (i.hasNext()) {
			Taskone ob = i.next();
			if (ob.name.equals(searchname)) {
				i.remove();
				System.out.println();

			}
		}
		view();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Taskone();

	}

}
