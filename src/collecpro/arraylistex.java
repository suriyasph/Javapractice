package collecpro;
import java.util.*;

public class arraylistex {
               String Employee;
               int id;
               int salary;
               arraylistex(String Employee,int id,int salary){
                      this.Employee=Employee;
                      this.id=id;
                      this.salary=salary;
               }
       	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<arraylistex> ob=new ArrayList<>();
		ob.add(new arraylistex("suriya",1,15000));
		ob.add(new arraylistex("nandha",2,18000));
		ob.add(new arraylistex("thiyagu",3,20000));
	    Iterator a=ob.iterator();
	    while(a.hasNext())
	    {          arraylistex ab=(arraylistex)a.next();
	    	System.out.println(ab.Employee);
	    
	    }
 

	}

}
