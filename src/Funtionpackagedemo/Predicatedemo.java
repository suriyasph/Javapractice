package Funtionpackagedemo;
import java.util.function.Predicate;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class Predicatedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p=a->a==97;
		System.out.println(p.test((int)'a'));
		
		BiPredicate<Integer,Integer> bi=(a,b)->a==97||b==98;
		System.out.println(bi.test(97,98));
		BiPredicate<String,String> s=(a,b)->a.equals(b);
		System.out.println(s.test("suriya","suriya"));
		Function<Integer,Integer> f=a->{return a+5;};
		System.out.println(f.apply(10));
		BiFunction<Integer ,Integer,String> bif= (a,b)->{return Integer.toString(a+b);};
		System.out.println(bif.apply(10, 30));
		Consumer <Integer> c=a->{System.out.println(a);};
		c.accept(510);
		BiConsumer <Integer,Integer> bc=(a,b)->{System.out.println(a*b);};
		bc.accept(510,2);
		Supplier <String> sup=()->"suriya";
		System.out.println(sup.get());
		 

	}  

}
