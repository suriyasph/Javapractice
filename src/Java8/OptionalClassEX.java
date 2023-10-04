package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassEX {

	public static void main(String[] args) {
	
		List<String>list=Arrays.asList("java","phython","c","androids","jsp");
		
		//ifPresent()
		list.stream().reduce((A,b)->A.concat(" "+b)).ifPresent(X->System.out.println(X));
		
		//get()
		String opt=list.stream().reduce((K,KF)->K.concat(KF)).get();
		System.out.println(opt); 
		
		String  az=list.stream().min((S1,S2)->S1.compareTo(S2)).get();
		System.out.println("Compare "+az);
		//it is used to compare the min value using comparator 
		
		String awa=list.stream().max((S1,S2)->S1.compareTo(S2)).get();
		System.out.println("Max values"+awa);
		
		Optional op=Optional.of(list);
		System.out.println("Optional value "+op.isPresent());
		op.ifPresent(C->System.out.println(C+ "programming"));
	
		//avoid null pointer Exception
		Optional op1=Optional.ofNullable(null);
		System.out.println(op1);//optional is empty
		System.out.println("Optional value "+op1.isPresent());
		op1.ifPresent(S->System.out.println(S));
		
		//Optional op2=Optional.ofNullable("java");
		//System.out.println(op2.isPresent());
		//op2.ifPresent(S->System.out.println(S));
		
	
		Optional op3=Optional.empty();
		System.out.println(op3);
		System.out.println(op3.isPresent());
		op3.ifPresent(S->System.out.print(S));
		
		
		
	//	Optional op4 =Optional.empty();
		
		 
	}

}