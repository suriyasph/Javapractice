package pack;
import java.util.*;
public class Dowhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="";
		do {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println(c);
        System.out.println("do u want to continue");
         s=sc.next();
		}while(s.equals("yes"));
	}

}
