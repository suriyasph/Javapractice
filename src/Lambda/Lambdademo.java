package Lambda;

interface abc {
	void add();

	default void sub() {
		System.out.println("sub");
	}

	default void mul() {
		System.out.println("mul");
	}

	static void div() {
		System.out.println("div");
	}

}

public class Lambdademo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc ob = () -> System.out.println("add");;
		ob.add();
		ob.sub();
		ob.mul();
		abc.div();
	}

}
