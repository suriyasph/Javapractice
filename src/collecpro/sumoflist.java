package collecpro;
import java.util.*;

public class sumoflist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ob=new ArrayList();
	    for( int i=1;i<10;i++)
	    {
	    	ob.add(i);
	    }
	    System.out.println(ob);
		int sum=0;
		for(int i=0;i<ob.size();i++)
		{   int a=(int) ob.get(i);
			sum+=a;
		}
		System.out.println(sum);
		System.out.println("Shuffule the elements in list");
		Collections.shuffle(ob);
		System.out.println(ob);
		

		

	}

}
