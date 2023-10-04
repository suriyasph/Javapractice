package map;
import java.util.*;
public class Mapdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<>();
		map.put("John","Math");
		map.put("Emma","English");
		map.put("Ryan","Science");
		map.put("Mia","History");
		map.put("Ethan","Math");
		System.out.println(map);
		System.out.println(map.get("Mia"));
		System.out.println(map.containsKey("Olivia"));
		System.out.println(map.put("Ryan","Computer Science"));
		System.out.println(map.get("Ryan"));
		for(Map.Entry i:map.entrySet())
		{
			System.out.println(i.getKey()+":"+i.getValue());
		}


	}

}
