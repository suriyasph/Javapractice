package collecpro;
import java.util.*;
public class mapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map=new HashMap<>();
		map.put(5, "suriya");
		map.put(7, "prakash");
		map.put(2,"thiyagu");
		map.put(null, "mani");
		map.put(8, "nagaraj");
		System.out.println(map);
		Set ov=map.entrySet();
		System.out.println(ov);
		Iterator<Map.Entry<Integer, String>> i=ov.iterator();
		while(i.hasNext())
		{
              System.out.println(i.next().getValue());		
              
        }
		System.out.println("-------------------------");
		for(Map.Entry<Integer, String> a:map.entrySet())
		{
			
			System.out.println(a.getKey());
		}
		String s="suriya";
		s="suriyaprakash";
		System.out.println(s);
	}

}
