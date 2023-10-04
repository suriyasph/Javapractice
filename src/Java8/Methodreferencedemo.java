package Java8;
@FunctionalInterface
interface A{
	void add();
}
@FunctionalInterface
interface B{
	int add2();
}
public class Methodreferencedemo { 
	static void sub() {
		System.out.println("Hello");
	}
	static int mul()  
	{
		return 45;
	}	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=Methodreferencedemo::sub;
		obj.add();
		sub();
		B obj2=Methodreferencedemo::mul;
		int a=obj2.add2();
		int b=mul();
		System.out.println(a);
		System.out.println(b);

	}
}
