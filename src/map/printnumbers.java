package map;
import java.util.*;
public class printnumbers {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name=new ArrayList<>();;
		name.add("suriya");
		name.add("prakash");
		name.add("bhavi");
	    name.add("thiyagu");
		ArrayList<String> number=new ArrayList<>();;
		number.add("8122711516");
		number.add("6381423521");
		number.add("6325479154");
		number.add("8795113213");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name");
		System.out.println(number.get(name.indexOf(scan.nextLine())));


	}

}
