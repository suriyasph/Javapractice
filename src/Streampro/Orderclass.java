package Streampro;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.stream.Stream;

class product {
	int productid;
	int quantity;

	public product(int productid, int quantity) {
		this.productid = productid;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "productid=" + productid + "quantity=" + quantity;
	}
}

public class Orderclass {
	private int orderid;
	List<product> list;

	public Orderclass(int orderid, List<product> list) {
		this.orderid = orderid;
		this.list = list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Orderclass> list = Arrays.asList(new Orderclass(1, List.of(new product(101, 2), new product(102, 3))),
				new Orderclass(2, List.of(new product(103, 1), new product(101, 4))),
				new Orderclass(3, List.of(new product(104, 2), new product(102, 1))));

		list.stream().forEach(x -> System.out.println(x));
		System.out.println("------------------------");
		List<product> l = list.stream().flatMap(x -> x.list.stream()).collect(Collectors.toList());
		System.out.println(l);
		/*
		 * long n=l.stream().count(); System.out.println(n);
		 */
		l.stream().collect(Collectors.groupingBy(X -> X.productid, Collectors.summingInt(X -> X.quantity))).entrySet()
				.forEach(x -> System.out.println("Product id " + x.getKey() + " Quantity " + x.getValue()));
		/*
		 * System.out.println("---------------------------");
		 * list.stream().flatMap(x->x.list.stream()).forEach(System.out::println);
		 * 
		 */

	}

	@Override
	public String toString() {
		return "[orderid=" + orderid + " " + list + "]";
	}

}
