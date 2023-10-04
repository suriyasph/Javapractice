package collecpro;

import java.util.*;

public class wordsinlist {
	void list() {
		ArrayList li=new ArrayList();
		li.add(2);
		li.add(7);
		li.add(5);
		li.add(2);
		li.add(5);
		li.add(7);
		System.out.print(li);
		Set s=new HashSet(li);
		li.clear();
		li.addAll(s);
		System.out.println(li);
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sentence = scanner.nextLine();
		ArrayList<String> list = new ArrayList<>();
		String[] arr = sentence.split(" ");
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		wordsinlist l=new wordsinlist();
		l.list();

	}

}
