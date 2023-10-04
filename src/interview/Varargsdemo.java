package interview;
import static java.lang.System.out;
public class Varargsdemo {
	static void function(Object...s)
	{   System.out.println("function method");
		for(Object e:s)
		   System.out.println(e);
	}

	public static void main(String...args) {
		// TODO Auto-generated method stub
		function();
		function("suriya","prakash");
		function(1,5,4);
		out.println("suriya");
		out.println("Prakash");
		

	}

}
