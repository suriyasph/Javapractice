package Practice;
import java.util.*;
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		try {
		System.out.println(a/b);}
		catch (ArithmeticException si)
		{
			System.out.println(si);
			System.out.println("check the number");
		}
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);

	}

}
