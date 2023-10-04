package collecpro;
import java.util.*;

public class collectionsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		list.add("Suriya");
		list.add("prakash");
		list.add("Thiyagu");
		list.add("Sathaya");
		list.add("Suriya");
		list.add("prakash");
		System.out.println(list);
		TreeSet<String> set=new TreeSet<String>(list);
        list.clear();
        list.addAll(set);
        System.out.println(list);
	}

}
