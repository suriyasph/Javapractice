package Practice;

class details {
	private String name;
	private int age;

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

}

public class practiceen extends details {

	practiceen() {
		setName("Suriyaprakash");
		setAge(23);
		System.out.println(getName());
		System.out.println(getAge());
	}

	public static void main(String[] args) {
		practiceen ob = new practiceen();

	}

}
