package Streampro;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Studentmanagment {
	private String name;
	private int age;
	private String course;

	public Studentmanagment(String name, int age, String course) {
		this.name = name;
		this.age = age;
		this.course = course;
	}

	

	public static void main(String[] args) {
		List<Studentmanagment> students = new ArrayList<>();
		students.add(new Studentmanagment("Suriya",23,"B.E"));
		Scanner scanner = new Scanner(System.in);

		int choice;
		do {
			System.out.println("Student Management System");
			System.out.println("1. Add a new student");
			System.out.println("2. View all students");
			System.out.println("3. Find students by course");
			System.out.println("4. Calculate the average age of students");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline left after reading the int.

			switch (choice) {
			case 1:
				  System.out.print("Enter student's name: ");
                  String name = scanner.nextLine();
                  System.out.print("Enter student's age: ");
                  int age = scanner.nextInt();
                  scanner.nextLine(); // Consume the newline left after reading the int.
                  System.out.print("Enter student's course: ");
                  String course = scanner.nextLine();

                  students.add(new Studentmanagment(name, age, course));
                  System.out.println("Student added successfully!");
                  break;
			case 2:
				students.stream().forEach(x->System.out.println(x.name+" "+x.age+" "+x.course));
				break;
			case 3:
				System.out.println("Enter the course name");
				String coursename=scanner.nextLine();
				students.stream().filter(x->x.course.equalsIgnoreCase(coursename)).map(X->X.name).forEach(System.out::println);
				break;
			case 4:
			OptionalDouble ave = students.stream()
                    .mapToDouble(x->x.age).average();           
			System.out.println(ave);	
            break;
			case 5:
				System.out.println("Terminated");
				break;
            } 
			}while (choice != 5);
	}
}