package pack;
import java.util.*;
public class ForEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 no.");
        int s=sc.nextInt();
        int e=sc.nextInt();
        for(int i=s;i<e;i++) {
        	System.out.println(i);
        }
        
        while(s<=e) {
        	System.out.println(s);
        	s++;
        }
	}

}
