package collecpro;
import java.util.*;
public class sortingstringlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> string=new ArrayList<>();
		Scanner scanner =new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter the "+(i+1)+" string..");
			string.add(new String(scanner.next()));
		}
	 System.out.println("List before sort");
     System.out.println(string);
     Collections.sort(string);
     System.out.println("List after sort");
     System.out.println(string);
     Collections.sort(string,Collections.reverseOrder());
     System.out.println("List after reverse");
     System.out.println(string);

     
 
	}

}
