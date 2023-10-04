package collecpro;
import java.util.*;

public class integerset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set1=new HashSet<>();
		HashSet<Integer> set2=new HashSet<>();
		for(int i=3;i<25;i++)
			set1.add(i);
		for(int i=10;i<45;i+=2)
			set2.add(i);
		System.out.println("First list");
		System.out.println(set1);
		System.out.println("Second list");
		System.out.println(set2);
		System.out.println("UNION OF SETS");
		HashSet<Integer> set3=new HashSet<>();
		set3.addAll(set1);
		set3.addAll(set2);
		System.out.println(set3);
		System.out.println("Intersection of sets");
		System.out.println(set1.retainAll(set2));
        System.out.println("Difference in sets");
        


     String s1="suriya";
     String s2="sanjay";
     System.out.print(s1.compareTo(s2));
     
     



		
		

	}

}
