package map;
import java.util.*;

public class Mapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<>();
		map.put("USA","Washington, D.C");
		map.put("France", "Paris");
		map.put("Germany", "Berlin");
		map.put("Japan", "Tokyo");
		map.put("India", "New Delhi");
		System.out.println(map.get("Germany"));
		System.out.println(map.containsKey("China"));
		System.out.println(map.remove("France"));
		for(Map.Entry<String,String> a:map.entrySet())
		{
			System.out.println(a.getKey()+" : "+a.getValue());
		}
	}

}
