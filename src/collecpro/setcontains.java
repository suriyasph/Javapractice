package collecpro;
import java.util.*;
public class setcontains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<>();
		set.add("govaluu");
		set.add("nesamani");
		HashSet<String> set1=new HashSet<>();
		set1.add("chandhru");
		set1.add("nesamani");
		set1.add("kisinamorthy");
		set1.add("govaluu");
		set1.add("aravind");
		System.out.println(set1.containsAll(set));




	}

}
