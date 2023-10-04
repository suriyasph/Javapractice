package collecpro;
import java.util.HashMap;
import java.util.Map;
public class Hashmapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer ,String> hmap=new HashMap<>();
		hmap.put(5, "Suriya");
		hmap.put(8,"Nandha");
		hmap.put(1, "Thiyagu");
		System.out.println(hmap);
        System.out.println(hmap.get(5));
        for(Map.Entry<Integer,String> i:hmap.entrySet())
        {
        	System.out.println(i.getValue());
        	System.out.println(i.getKey());
        }
	}

}
