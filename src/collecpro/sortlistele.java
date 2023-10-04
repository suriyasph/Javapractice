package collecpro;
import java.util.*;


public class sortlistele 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=1;i<=10;i++)
			list.add(i);
		for(int i=9;i>=0;i--)
			list.add(i);
		System.out.println(list);
		System.out.println("Frequency of elements in array");
		System.out.println(list.size());
		System.out.println("Sorting of elements in list");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Mininum number in list");
		System.out.println(Collections.min(list));
		System.out.println("Maximum number in list");
		System.out.println(Collections.max(list));
		System.out.println("Second largest number in list");
		System.out.println(list.get(list.size()-2));
		System.out.println("Enter the element to search");
		Integer a=scanner.nextInt();
		System.out.println(list.contains(a));

	}

}
