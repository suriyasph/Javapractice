package map;
import java.util.*;
public class mapdemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> list =new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("apple");
		list.add("orange");
		list.add("banana");
		list.add("grape");
		list.add("apple");
        System.out.println(list);
        Map<String,Integer> map= new HashMap<>();
        for(String s:list)
        System.out.println(map);
	}

}
