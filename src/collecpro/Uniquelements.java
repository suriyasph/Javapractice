package collecpro;
import java.util.*; 
public class Uniquelements {
	public static void main(String argv[]) {
	List<String> list = new ArrayList<String>();
	list.add("suriya");
	list.add("prakash");
	list.add("suriya");
	list.add("nandha");
	list.add("thiyagu");
	list.add("suriya");
	Set<String> set = new HashSet<String>(list);
	for (String s : set) {
	    System.out.println(s + ": " + Collections.frequency(list, s));
	}
	}
}
