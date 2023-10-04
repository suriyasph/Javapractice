package Java8;
import java.util.function.Function;
@FunctionalInterface
interface co{
	void run();
}
public class Consref {
	Consref()
	{
		System.out.println("Suriya");
	}
	Consref(int a)
	{
		System.out.println("Suriya");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		co ob=Consref::new;
		ob.run();
		Function<Integer,Consref> fun=Consref::new;
		fun.apply(2);
		

	}

}
	