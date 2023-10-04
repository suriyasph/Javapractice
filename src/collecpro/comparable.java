package collecpro;
import java.util.ArrayList;
import java.util.Collections;
public class comparable implements Comparable<comparable> {
	String empname;
	int id;
	int salary;
	public int compareTo(comparable ob)
	{
		if(id<ob.id)
			return -1;
		else if(id>ob.id)
			return 1;
		else 
			return 0;
	}
	

	public comparable(String empname, int id, int salary) {
		this.empname = empname;
		this.id = id;
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<comparable> obj = new ArrayList<>();
		obj.add(new comparable("suriya", 21012419, 20000));
		obj.add(new comparable("prakash", 21012482, 21000));
		obj.add(new comparable("thiyagu", 21011567, 19000));
		obj.add(new comparable("sunil", 21014588, 25000));
		obj.add(new comparable("suresh", 21011922, 23000));
		obj.add(new comparable("nagaraj", 21013548, 28000));
		for(comparable e:obj)
		System.out.println(e.empname+" "+e.id);
	System.out.println("--------------------------------------------------------------");
		Collections.sort(obj);
		for(comparable e:obj)
			System.out.println(e.empname+" "+e.id);
		
		
		

	}

}
