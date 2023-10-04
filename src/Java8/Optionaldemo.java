package Java8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Optionaldemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"Java","c","Python","Ruby","Php"};
		List<String> list=new ArrayList<>();
		list=Arrays.asList(arr);
		System.out.println(list);
		//if present -it is used to print the optional class value
		list.stream().reduce((a,b)->a.concat(" "+b)).ifPresent(x->System.out.println(x));
		//get-it is used to convert the Optional class object to class object   
		String s=list.stream().reduce((a,b)->a.concat(" "+b)).get();
		System.out.println(s);



	}

}
