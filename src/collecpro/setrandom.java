package collecpro;
import java.util.*;
public class setrandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		int j=0;
	    Set<Integer> set=new HashSet<>();
	    for(int i=1;i<=1000;i++) {
	    	j=random.nextInt(i);		   
	    }
	    System.out.println(j);
	}

}
